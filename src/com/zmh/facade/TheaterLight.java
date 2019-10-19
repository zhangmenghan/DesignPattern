package com.zmh.facade;

public class TheaterLight {
	private TheaterLight() {}
	
	private static TheaterLight instance = new TheaterLight();
	
	public static TheaterLight getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" theaterLight on ");
	}
	
	public void off() {
		System.out.println("theaterLight off");
	}
	
	public void dim() {
		System.out.println(" theaterLight dim ");
	}
	
	public void bright() {
		System.out.println("theaterLight bright");
	}
}
