package com.zmh.strategy.improve;

public class ToyDuck extends Duck{

	
	public ToyDuck() {
		System.out.println("~~~玩具鸭~~~");
		flyBehavior = new NoFlyBehavior();
		quackBehavior = new NoQuackBehavior();
		swimBehavior = new CannotSwimBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("~~~玩具鸭~~~");
	}
	
}
