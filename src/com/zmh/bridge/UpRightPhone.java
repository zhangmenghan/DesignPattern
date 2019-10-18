package com.zmh.bridge;

public class UpRightPhone extends Phone{

	public UpRightPhone(Brand brand) {
		super(brand);
	}

	protected void open() {
		super.open();
		System.out.println("平板样式的手机");
	}
	
	protected void call() {
		super.call();
		System.out.println("平板样式的手机");
	}
	
	protected void close() {
		super.close();
		System.out.println("平板样式的手机");
	}
	
}
