package com.zmh.simpleFactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
	@Override
	public void prepare() {
		setName(" 奶酪披萨 ");
		System.out.println(name + " preparing;");
	}
}
