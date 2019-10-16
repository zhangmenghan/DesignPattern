package com.zmh.singleton.type7;

public class SingleonTest07 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//静态内部类
class Singleton{
	//这 种方式采 用了类装载的机制来保证初始化实例时只有一个线程 。
	//静 态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化
	//时，调用 getInstance 方法，才会装载 SingletonInstance 类，从而完成 Singleton 的实例化 。
	//类 的静态属性只会在第一次加载类的时候初始化，所以在这里， JVM 帮助我们
	//保证了线程的安全性，在类进行初始化时，别的线程是无法进入的 。
	//优 点：避免了 线程不安全 ，利用静态内部类特点实现延 迟加载，效率 高
	//结 论：推荐使用
	
	private Singleton() {}
	
	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	//提供一个共有的静态方法,返回实例对象
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}
	
	