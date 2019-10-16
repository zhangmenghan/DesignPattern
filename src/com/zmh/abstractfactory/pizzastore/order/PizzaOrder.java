package com.zmh.abstractfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zmh.abstractfactory.pizzastore.pizza.Pizza;

public class PizzaOrder {
	AbstractFactory abstractFactory;
	
	public PizzaOrder(AbstractFactory factory) {
		setFactory(factory);
	}
	
	private void setFactory(AbstractFactory factory) {
		Pizza pizza = null;
		String orderType = "";
		
		this.abstractFactory = factory;
		do {
			orderType = gettype();
			pizza = factory.createPizza(orderType);
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("Error");
				break;
			}
		}while(true);
	}
	
	private String gettype() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
