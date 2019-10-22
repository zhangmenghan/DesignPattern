package com.zmh.strategy.improve;

public abstract class Duck {

	//属性, 策略接口
	FlyBehavior flyBehavior;
	//其它属性<->策略接口
	QuackBehavior quackBehavior;
	
	SwimBehavior swimBehavior;
	
	public Duck() {
	
	}

	public abstract void display();//显示鸭子信息
	
	public void quack() {
		if(quackBehavior != null) {
			quackBehavior.quack();
		}else {
			System.out.println("无参数");
		}
	}
	
	public void swim() {
		if(swimBehavior != null) {
			swimBehavior.swim();
		}else {
			System.out.println("无参数");
		}
	}
	
	public void fly() {
		//改进
		if(flyBehavior != null) {
			flyBehavior.fly();
		}else {
			System.out.println("无参数");
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setSwimBehavior(SwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}
	
}
