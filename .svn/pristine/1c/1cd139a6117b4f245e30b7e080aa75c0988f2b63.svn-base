package com.soonfor.config.mutitenant;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

public class RentalIdentifierResolverImpl implements CurrentTenantIdentifierResolver {
	@Value("${multitenant.tenantKey}")
	String tenantKey;

	@Value("${multitenant.defaultTenant}")
	String defaultTenant;

	private static String DEFAULT_TENANT_ID = "mengtian";

	// ThreadLocal使用这个
	/*@Override
	public String resolveCurrentTenantIdentifier() {
		String currentTenantId = RentalTenantContext.getTenantId();
		return (currentTenantId != null) ? currentTenantId : DEFAULT_TENANT_ID;
	}*/
	 

	@Override
	public String resolveCurrentTenantIdentifier() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes != null) {
			String tenantId = (String) requestAttributes.getAttribute(tenantKey, RequestAttributes.SCOPE_REQUEST);
			if (tenantId != null) {
				return tenantId;
			}
		}
		return defaultTenant;
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return false;
	}

}
