package com.zmh.simpleFactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zmh.simpleFactory.pizzastore.pizza.Pizza;

public class PizzaOrder2 {

	Pizza pizza = null;
	String orderType = "";

	public PizzaOrder2() {
		do {
			orderType = gettype();
			pizza = SimpleFactory.createPizza(orderType);

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
