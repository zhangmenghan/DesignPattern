package com.zmh.proxy.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		ITeacherDao target = new TeacherDao();
		ProxyFactory factory = new ProxyFactory(target);
		ITeacherDao proxyInstance = (ITeacherDao) factory.getProxyInstance();
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		proxyInstance.teach();
		proxyInstance.sayHello("Tom");
	}
}
