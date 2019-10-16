package com.zmh.singleton.type8;

public class SingleonTest08 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.INSTANCE;
		Singleton singleton2 = Singleton.INSTANCE;
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//枚举
//这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而
//且还能防止反序列化重新创建新的对象 。
//这种方式是 Effective Java 作者 Josh Bloch 提倡的方式
//结论：推荐使用
enum Singleton{
	INSTANCE;
	public void method() {
		//方法
	}
}
	
	