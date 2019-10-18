package com.zmh.composite;

public class Client {

	public static void main(String[] args) {
		OrganizationComponent university = new University("北大青鸟", "牛皮");
		
		OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
		OrganizationComponent softwareCollege = new College("信息工程学院", "信息工程学院");
		
		computerCollege.add(new Department("软件工程", "软件工程"));
		computerCollege.add(new Department("网络安全", "网络安全"));
		computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术"));
		
		softwareCollege.add(new Department("通信工程", "通信工程"));
		softwareCollege.add(new Department("信息工程", "信息工程"));
		
		university.add(computerCollege);
		university.add(softwareCollege);
		
		university.print();
	}

}
