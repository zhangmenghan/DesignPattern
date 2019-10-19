package com.zmh.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{
	
	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}

	//返回一个对象(target)的代理对象
	public Object getProxyInstance() {
		//1.创建一个工具类
		Enhancer enhancer = new Enhancer();
		//2，设置父类
		enhancer.setSuperclass(target.getClass());
		//3.设置回调函数
		enhancer.setCallback(this);
		//4.创建子类对象(代理对象)
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("cglib代理模式开始");
		Object result = method.invoke(target, args);
		System.out.println("cglib代理模式提交");
		return result;
	}
	
}
