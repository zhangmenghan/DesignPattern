package com.zmh.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{

	List<Department> departmentList;
	int numberOfDepartment = 0;//保存当前数组的对象个数
	
	
	
	public InfoCollege() {
		departmentList = new ArrayList<>();
		addDepartment("信息JAVA", "信息JAVA专业");
		addDepartment("信息PHP", "信息PHP专业");
		addDepartment("信息大数据", "信息大数据专业");
	}

	@Override
	public String getName() {
		return "信息工程学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
	}

	@Override
	public Iterator<Object> createIterator() {
		return new InfoCollegeIterator(departmentList);
	}

}
