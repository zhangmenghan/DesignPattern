package com.zmh.observer.weather;

public class Client {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WeatherData weatherData = new WeatherData(currentConditions);
		
		weatherData.setData(30, 150, 40);
		
		System.out.println("============天气情况变化=============");
		weatherData.setData(40, 160, 20);
		

	}
}
