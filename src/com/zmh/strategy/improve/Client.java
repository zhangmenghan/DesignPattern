package com.zmh.strategy.improve;

public class Client {

	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();
		wildDuck.quack();
		wildDuck.swim();
		
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		toyDuck.quack();
		toyDuck.swim();
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		pekingDuck.quack();
		pekingDuck.swim();
		
		//动态改变某个对象的行为, 北京鸭 不能飞
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("北京鸭的实际飞翔能力");
		pekingDuck.fly();
	}

}
