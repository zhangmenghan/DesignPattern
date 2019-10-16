package com.zmh.abstractfactory.pizzastore.order;

public class PizzaStore {
	public static void main(String[] args) {
		new PizzaOrder(new BJFactory());
	}
}
