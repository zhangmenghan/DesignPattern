package com.zmh.simpleFactory.pizzastore.order;

public class PizzaStore {
	public static void main(String[] args) {
		//使用简单工厂模式
//		new PizzaOrder(new SimpleFactory());
		new PizzaOrder2();
	}
}
