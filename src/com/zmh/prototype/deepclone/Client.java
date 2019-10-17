package com.zmh.prototype.deepclone;

public class Client {
	public static void main(String[] args) throws Exception {
		DeepPrototype p1 = new DeepPrototype();
		p1.name = "宋江";
		p1.deepCloneableTarget = new DeepCloneableTarget("铁牛", "李铁牛");

		// 方式1
		DeepPrototype p2 = (DeepPrototype) p1.clone();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		// 方式2
		DeepPrototype p3 = (DeepPrototype) p1.deepClone();
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
	}
}
