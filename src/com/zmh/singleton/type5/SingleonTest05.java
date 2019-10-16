package com.zmh.singleton.type5;

public class SingleonTest05 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//懒汉式
class Singleton{
	//这种方式,本意是想对第四种实现方式的改进,因为前面同步方法效率太低,改为同步产生实例化的的代码块
	//但是这种同步并不能起到线程同步的作用 。跟第 3 种实现方式遇到的情形一
	//致，假如一个线程进入了 if (singleton == null) 判断语句块，还未来得及往下执行，
	//另一个线程也通过了这个判断语句，这时便会产生多个实 例
	//结论：在 实际开发中， 不 能 使 用这种方 式
	private static Singleton instance;
	
	//构造器私有化,外部不能new
	private Singleton() {}
	
	//提供一个静态的公有方法,加入了同步处理的代码,解决线程安全问题
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
}
	
	