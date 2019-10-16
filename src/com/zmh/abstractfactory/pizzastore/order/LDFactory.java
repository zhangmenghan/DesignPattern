package com.zmh.abstractfactory.pizzastore.order;

import com.zmh.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.zmh.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.zmh.abstractfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbstractFactory {

	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
