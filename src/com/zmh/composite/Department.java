package com.zmh.composite;

public class Department extends OrganizationComponent{

	public Department(String name, String desc) {
		super(name, desc);
	}

	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public String getDesc() {
		return super.getDesc();
	}
	
	@Override
	protected void print() {
		System.out.println(getName());
	}
}
