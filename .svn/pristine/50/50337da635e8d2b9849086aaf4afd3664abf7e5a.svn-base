package com.soonfor.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soonfor.entity.admin.AdminUser;
import com.soonfor.service.AdminUserService;

@RestController
@RequestMapping(value = "adminuser")
public class AdminUserController {
	@Autowired
	private AdminUserService adminUserService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<AdminUser> list(){
		List<AdminUser> adminUsers = adminUserService.findAll();
		return adminUsers;
	}
	
	@RequestMapping(value="save/{name}",method = RequestMethod.GET)
	@ResponseBody
	public String save(@PathVariable String name){
		AdminUser adminUser = adminUserService.findById(1);
		adminUser.setName(name);
		adminUserService.save(adminUser);
		return "SUCCESS";
	}
}
