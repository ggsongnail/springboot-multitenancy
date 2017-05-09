package com.soonfor.config.mutitenant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "multitenancy.tenant")
public class MultiTenantRentalProperty {

	private List<MyDataSourceProperties> myDataSourcesProps;

	public List<MyDataSourceProperties> getMyDataSources() {
		return this.myDataSourcesProps;
	}

	public void setMyDataSources(List<MyDataSourceProperties> myDataSourcesProps) {
		this.myDataSourcesProps = myDataSourcesProps;
	}

	public static class MyDataSourceProperties extends DataSourceProperties {
		private String tenantId;
		public String getTenantId() {
			return tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
}
