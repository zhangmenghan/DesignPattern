package com.zmh.singleton.type3;

public class SingleonTest03 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//懒汉式(线程不安全)
class Singleton{
	//起到了懒加载的效果,但是只能在单线程下使用 。
	//如果在多线程下,一个线程进入了 if (singleton == null) 
	//判断语句块,还未来得及往下执行,另一个线程也通过了这个判断语句,
	//这时便会产生多个实例.
	//结 论   在实际开发中,不要使用这种方式
	
	private static Singleton instance;
	
	//构造器私有化,外部不能new
	private Singleton() {}
	
	//提供一个静态的公有方法,当使到该方法时,才去创建instance
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
	
	