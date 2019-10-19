package com.zmh.flyweight;

public class ConcrateWebSite extends WebSite{

	//共享的部分
	private String type = "";
	
	public ConcrateWebSite(String type) {
		this.type = type;
	}
	
	@Override
	public void use(User user) {
		System.out.println("网站的发布形式是" + type + "," + user.getName() + " 在使用中...");
	}

}
