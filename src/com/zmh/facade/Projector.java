package com.zmh.facade;

public class Projector {
	private Projector() {}
	
	private static Projector instance = new Projector();
	
	public static Projector getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" projector on ");
	}
	
	public void off() {
		System.out.println("projector off");
	}
	
	public void fox() {
		System.out.println(" projector is foxing ");
	}
}
