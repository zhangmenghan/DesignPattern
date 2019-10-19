package com.zmh.flyweight;

import java.util.HashMap;

public class WebSiteFactory {

	private HashMap<String, ConcrateWebSite> pool = new HashMap<>();
	
	public WebSite getWebSiteCategory(String type) {
		if(!pool.containsKey(type)) {
			pool.put(type, new ConcrateWebSite(type));
		}
		return (WebSite)pool.get(type);
	}
	
	public int getWebSIteCount() {
		return pool.size();
	}
}
