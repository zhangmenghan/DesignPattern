package com.zmh.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
	//学院集合
	List<College> collegeList;

	public OutputImpl(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	//输出  学院输出系
	public void printCollege() {
		//从 collegeList 取出所有学院
		Iterator<College> iterator = collegeList.iterator();
		while(iterator.hasNext()) {
			College college = iterator.next();
			System.out.println("==========" + college.getName() + "==========");
			printDepartment(college.createIterator());
		}
	}
	
	public void printDepartment(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			Department d = (Department) iterator.next();
			System.out.println(d.getName());
		}
	}
}
