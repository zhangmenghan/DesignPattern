package com.zmh.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator<Object> {

	// 这里我们需要Department是以怎样的方式存放的
	List<Department> departmentList;
	int position = -1;

	public InfoCollegeIterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	// 判断是否还有下一个元素
	@Override
	public boolean hasNext() {
		if (position >= departmentList.size()-1) {
			return false;
		} else {
			position+=1;
			return true;
		}
	}

	@Override
	public Object next() {
		return departmentList.get(position);
	}
	
	//删除的方法,默认空实现
	public void remove() {
		
	}

}
