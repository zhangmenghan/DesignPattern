package com.zmh.singleton.type4;

public class SingleonTest04 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//懒汉式(线程安全)
class Singleton{
	//解决了线程不安全问题
	//效率太低了,每个线程在想获得类的实例时候,执行 getInstance()
	//方法都要进行同步.而其实这个方法只执行一次实例化代码就够了,后面的想获得该类实例,
	//直接 return 就行了。方法进行同步效率太 低
	//结 论    在实际开发中, 不推荐使用这种方式
	private static Singleton instance;
	
	//构造器私有化,外部不能new
	private Singleton() {}
	
	//提供一个静态的公有方法,加入了同步处理的代码,解决线程安全问题
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
	
	