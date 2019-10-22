package com.zmh.strategy.improve;

public class PekingDuck extends Duck {

	
	//假如北京鸭可以飞翔，但是飞翔技术一般
	public PekingDuck() {
		System.out.println("~~北京鸭~~~");
		flyBehavior = new BadFlyBehavior();
		quackBehavior = new GeGeQuackBehavior();
		swimBehavior = new CanSwimBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("~~北京鸭~~~");
	}
	
}
