package com.zmh.decorator;

//具体的Decorator,这里就是调味品
public class Soy extends Decorator{

	public Soy(Drink drink) {
		super(drink);
		setDes(" 豆浆 ");
		setPrice(1.5f);
	}
	
}
