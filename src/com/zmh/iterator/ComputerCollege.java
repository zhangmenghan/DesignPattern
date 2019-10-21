package com.zmh.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{

	Department[] departments;
	int numberOfDepartment = 0;//保存当前数组的对象个数
	
	
	
	public ComputerCollege() {
		departments = new Department[5];
		addDepartment("计算机JAVA", "计算机JAVA专业");
		addDepartment("计算机PHP", "计算机PHP专业");
		addDepartment("计算机大数据", "计算机大数据专业");
	}

	@Override
	public String getName() {
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments[numberOfDepartment] = department;
		numberOfDepartment+=1;
	}

	@Override
	public Iterator<Object> createIterator() {
		return new ComputerCollegeIterator(departments);
	}

}
