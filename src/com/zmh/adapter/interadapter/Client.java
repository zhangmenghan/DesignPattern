package com.zmh.adapter.interadapter;

public class Client {
	public static void main(String[] args) {
		AbsA absA = new AbsA() {
			//只需要覆盖我们需要使用的接口方法
			@Override
			public void m1() {
				System.out.println("use m1");
			}
		};
		absA.m1();
		absA.m2();
		absA.m3();
		absA.m4();
	}
}
