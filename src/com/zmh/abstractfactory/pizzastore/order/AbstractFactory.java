package com.zmh.abstractfactory.pizzastore.order;

import com.zmh.abstractfactory.pizzastore.pizza.Pizza;

public interface AbstractFactory {
	public Pizza createPizza(String orderType);
}
