package com.zmh.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		//1.classloader 指定当前目标对象使用的类加载器,获取加载器的方法是固定的
		//2.interface 目标对象实现的接口类型,使用泛型方式确认类型
		//3.invocationHandler 事情处理,执行目标对象方法时,会触发事情处理器的方法,会把当前执行目标对象方法作为参数传入
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK代理开始");
				Object result = method.invoke(target, args);
				System.out.println("JDK代理结束");
				return result;
			}
		});
	}
}
