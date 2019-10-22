package com.zmh.strategy.improve;

public class WildDuck extends Duck {

	
	//构造器，传入FlyBehavor 的对象
	public  WildDuck() {
		System.out.println("~~~野鸭~~~ ");
		flyBehavior = new GoodFlyBehavior();
		quackBehavior = new GaGaQuackBehavior();
		swimBehavior = new CanSwimBehavior();
	}
	
	
	@Override
	public void display() {
		System.out.println("~~~野鸭~~~ ");
	}

}
