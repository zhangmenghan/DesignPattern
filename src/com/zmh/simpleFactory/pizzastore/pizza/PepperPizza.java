package com.zmh.simpleFactory.pizzastore.pizza;

public class PepperPizza extends Pizza {
	@Override
	public void prepare() {
		setName(" 胡椒披萨 ");
		System.out.println(name + " preparing;");
	}
}
