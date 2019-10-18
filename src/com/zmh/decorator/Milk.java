package com.zmh.decorator;

//具体的Decorator,这里就是调味品
public class Milk extends Decorator{

	public Milk(Drink drink) {
		super(drink);
		setDes(" 牛奶 ");
		setPrice(2.0f);
	}
	
}
