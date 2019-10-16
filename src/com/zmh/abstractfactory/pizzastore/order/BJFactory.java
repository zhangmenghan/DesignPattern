package com.zmh.abstractfactory.pizzastore.order;

import com.zmh.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.zmh.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.zmh.abstractfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbstractFactory {

	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
