package com.zmh.singleton.type6;

public class SingleonTest06 {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.equals(singleton2));
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}


//双重检查
class Singleton{
	//Double Check 概 念 是 多 线程开 发中常使用到的， 如代码中所示，我们进行了两
	//次 if (singleton == null) 检查，这样就可以保证线程安全了 。
	//这 样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)
	//直接 return 实例化对 象，也避免的反复进行方法同步线程安全；延迟加载；效率较高
	//结论：在实际开发中，推荐使用这种单例设计模式
	
	private static volatile Singleton singleton;
	
	private Singleton() {}
	
	//提供一个静态的公有方法,加入了同步处理的代码,解决线程安全问题
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized (Singleton.class) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}
}
	
	