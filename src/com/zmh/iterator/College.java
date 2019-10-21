package com.zmh.iterator;

import java.util.Iterator;

public interface College {
	public String getName();
	public void addDepartment(String name, String desc);
	public Iterator<Object> createIterator();
}
