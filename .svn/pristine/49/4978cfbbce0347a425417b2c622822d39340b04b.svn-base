package com.soonfor.config.mutitenant;

import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class RentalDataSourceMultiTenantConnectionProviderImpl extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl{
	private static final long serialVersionUID = 1L;

	@Autowired
	private Map<String, DataSource> myDataSources;
	
	@Override
	protected DataSource selectAnyDataSource() {
		return this.myDataSources.values().iterator().next();
	}

	@Override
	protected DataSource selectDataSource(String tenantIdentifier) {
		return this.myDataSources.get(tenantIdentifier);
	}

}
