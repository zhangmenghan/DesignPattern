package com.zmh.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zmh.factorymethod.pizzastore.pizza.Pizza;

public abstract class PizzaOrder {
	public PizzaOrder() {
		Pizza pizza = null;
		String orderType = "";
		
		do {
			orderType = gettype();
			pizza = createPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" Error!!!!!! ");
				break;
			}
		} while (true);
	}

	abstract Pizza createPizza(String orderType);
	
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
