package com.soonfor.shell;

public class Test {

	public static void main(String[] args) {
		mkdatabase("erp_musi");
	}
	
	public static void mkdatabase(String databaseName){
		RemoteExecuteCommand tool = new RemoteExecuteCommand("192.168.217.128", "root", "root", "utf-8");
		String result = tool.exec("sh /opt/script/mkdatabase.sh "+databaseName+" erp_parent");
		System.out.print(result);
	}

}
