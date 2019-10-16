package com.zmh.simpleFactory.pizzastore.order;

import com.zmh.simpleFactory.pizzastore.pizza.CheesePizza;
import com.zmh.simpleFactory.pizzastore.pizza.GreekPizza;
import com.zmh.simpleFactory.pizzastore.pizza.PepperPizza;
import com.zmh.simpleFactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {
	public static Pizza createPizza(String type) {
		
		System.out.println("使用简单工厂模式");
		
		Pizza pizza = null;
		
		if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepper")) {
			pizza = new PepperPizza();
		}
		
		return pizza;
	}
}
