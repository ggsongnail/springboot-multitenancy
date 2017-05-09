package com.soonfor.config.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.soonfor.config.mutitenant.RentalTenantContext;

public class RentalMultiTenantInterceptor extends HandlerInterceptorAdapter {

	private static final String TENANT_HEADER_NAME = "X-TENANT-ID";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//String tenantId = request.getHeader(TENANT_HEADER_NAME);
		String tenantId = request.getParameter("ccid");
		RentalTenantContext.setTenantId(tenantId);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		RentalTenantContext.setTenantId(null);
	}
}