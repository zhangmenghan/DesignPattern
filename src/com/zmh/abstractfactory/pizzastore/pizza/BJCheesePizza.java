package com.zmh.abstractfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
	@Override
	public void prepare() {
		setName(" 北京的奶酪披萨 ");
		System.out.println(name + " preparing;");
	}
}
