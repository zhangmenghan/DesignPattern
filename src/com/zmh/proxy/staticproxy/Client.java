package com.zmh.proxy.staticproxy;

public class Client {
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
		proxy.teach();
	}
}
