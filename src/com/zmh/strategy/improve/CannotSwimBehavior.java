package com.zmh.strategy.improve;

public class CannotSwimBehavior implements SwimBehavior{

	@Override
	public void swim() {
		System.out.println("不会游泳");
	}

}
