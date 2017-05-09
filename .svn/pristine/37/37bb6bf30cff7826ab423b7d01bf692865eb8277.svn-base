package com.soonfor.config.mvc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class MultiTenantFilter implements Filter {

	@Value("${multitenant.tenantKey}")
    String tenantKey;
	
	@Value("${multitenant.defaultTenant}")
    String defaultTenant;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		//String tenant = req.getHeader(tenantKey);
		String tenant = req.getParameter(tenantKey);
		if (tenant != null) {
			req.setAttribute(tenantKey, tenant);
		} else {
			req.setAttribute(tenantKey, defaultTenant);
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
