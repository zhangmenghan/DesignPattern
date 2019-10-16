package com.zmh.factorymethod.pizzastore.order;

import com.zmh.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.zmh.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.zmh.factorymethod.pizzastore.pizza.Pizza;

public class BJPizzaOrder extends PizzaOrder {

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
