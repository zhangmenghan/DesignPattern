package com.zmh.facade;

public class Client {
	public static void main(String[] args) {
		HomeTheaterFacade facade = new HomeTheaterFacade();
		facade.ready();
		System.out.println("==================");
		facade.play();
		System.out.println("==================");
		facade.pause();
		System.out.println("==================");
		facade.end();
	}
}
