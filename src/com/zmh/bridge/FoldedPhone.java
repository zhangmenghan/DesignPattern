package com.zmh.bridge;

public class FoldedPhone extends Phone{

	public FoldedPhone(Brand brand) {
		super(brand);
	}

	protected void open() {
		super.open();
		System.out.println("折叠样式的手机");
	}
	
	protected void call() {
		super.call();
		System.out.println("折叠样式的手机");
	}
	
	protected void close() {
		super.close();
		System.out.println("折叠样式的手机");
	}

}
