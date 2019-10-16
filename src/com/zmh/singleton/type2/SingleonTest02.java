package com.zmh.singleton.type2;

public class SingleonTest02 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//饿汉式(静态代码块法)
class Singleton{
	//这种方式和上面的方式其实类似,只不过将类实例化的过程放在了静态代码块中,也是在类装载的时候,
	//就执行静态代码块中的代码,初始化类的实例    优缺点和上面是一样的 。
	//结 论     这种单例模式可用,但是可能造成内存浪费
	
	//构造器私有化,外部不能new
	private Singleton() {}
	
	//本类内部创建对象实例
	private static Singleton instance;
	
	//在静态代码块中,创建单例对象
	static {
		instance = new Singleton();
	}
	
	//提供一个共有的静态方法,返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}
	
	