package com.zmh.abstractfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
	@Override
	public void prepare() {
		setName(" 伦敦的胡椒披萨 ");
		System.out.println(name + " preparing;");
	}
}
