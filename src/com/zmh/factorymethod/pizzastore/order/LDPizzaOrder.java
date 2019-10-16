package com.zmh.factorymethod.pizzastore.order;

import com.zmh.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.zmh.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.zmh.factorymethod.pizzastore.pizza.Pizza;

public class LDPizzaOrder extends PizzaOrder {

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
