package com.zmh.template.improve;

public class Client {
	public static void main(String[] args) {
		System.out.println("制作红豆豆浆");
		SoyaMilk milk1 = new RedBean();
		milk1.make();
		System.out.println("制作花生豆浆");
		SoyaMilk milk2 = new Peanut();
		milk2.make();
		System.out.println("制作纯豆浆");
		SoyaMilk milk3 = new Pure();
		milk3.make();
	}
}
