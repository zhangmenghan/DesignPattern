package com.zmh.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
	@Override
	public void prepare() {
		setName(" 伦敦的奶酪披萨 ");
		System.out.println(name + " preparing;");
	}
}
