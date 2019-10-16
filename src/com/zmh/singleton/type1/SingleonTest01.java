package com.zmh.singleton.type1;

public class SingleonTest01 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//饿汉式(静态变量法)
class Singleton{
	//优 点 这种写法比较简单,就是在类装载的时候就完成实例化.避免了线程同步问题
	//缺 点 在类装载的时候就完成实例化,没有达到 Lazy Loading 的效果。
	//如果从始至终从未使用过这个实例,则会造成内存的浪费
	//结 论  这种单例模式可用,可能造成内存浪费
	
	//构造器私有化,外部不能new
	private Singleton() {}
	
	//本类内部创建对象实例
	private final static Singleton instance = new Singleton();
	
	//提供一个共有的静态方法,返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}
	
	