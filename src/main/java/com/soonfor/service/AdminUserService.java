package com.soonfor.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.soonfor.dao.AdminUserDao;
import com.soonfor.entity.admin.AdminUser;

@Service
@Transactional
public class AdminUserService {
	@Autowired
	private AdminUserDao adminUserDao;
	
	public List<AdminUser> findAll() {
		return adminUserDao.findAll();
	}
	
	public AdminUser findById(int id){
		return adminUserDao.findOne(id);
	}
	
	public void save(AdminUser adminUser){
		adminUserDao.save(adminUser);
	}
}
