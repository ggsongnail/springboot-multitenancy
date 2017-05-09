package com.soonfor.config.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.soonfor.config.mvc.interceptor.RentalMultiTenantInterceptor;


@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(new RentalMultiTenantInterceptor());
	}
}
