package com.zmh.abstractfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		setName(" 北京的胡椒披萨 ");
		System.out.println(name + " preparing;");
	}
}
