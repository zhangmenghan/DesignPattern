package com.zmh.flyweight;

public class Client {

	public static void main(String[] args) {
		WebSiteFactory factory = new WebSiteFactory();
		WebSite webSite1 = factory.getWebSiteCategory("news");
		webSite1.use(new User("Tom"));
		WebSite webSite2 = factory.getWebSiteCategory("blogs");
		webSite2.use(new User("Jack"));
		WebSite webSite3 = factory.getWebSiteCategory("blogs");
		webSite3.use(new User("Kally"));
		WebSite webSite4 = factory.getWebSiteCategory("news");
		webSite4.use(new User("Frank"));
		WebSite webSite5 = factory.getWebSiteCategory("news");
		webSite5.use(new User("Jim"));
		
		System.out.println("网站的分类共=" + factory.getWebSIteCount());
	}

}
