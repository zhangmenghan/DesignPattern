package com.zmh.simpleFactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
	@Override
	public void prepare() {
		setName(" 希腊披萨 ");
		System.out.println(name + " preparing;");
	}
}
