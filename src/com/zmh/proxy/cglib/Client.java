package com.zmh.proxy.cglib;

public class Client {

	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		ProxyFactory factory = new ProxyFactory(teacherDao);
		TeacherDao proxyInstance = (TeacherDao) factory.getProxyInstance();
		proxyInstance.teach();
	}

}
