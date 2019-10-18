package com.zmh.decorator;

public class CoffeeBar {
	public static void main(String[] args) {
		//1.点一份LongBlack
		Drink order = new LongBlack();
		System.out.println("描述="+order.getDes());
		System.out.println("费用1=" + order.cost());
		
		//2.加入一份牛奶
		order = new Milk(order);
		System.out.println("描述="+order.getDes());
		System.out.println("费用2=" + order.cost());
		
		//3.再加入一份巧克力
		order = new Chocolate(order);
		System.out.println("描述="+order.getDes());
		System.out.println("费用3=" + order.cost());
	}
}
