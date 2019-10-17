package com.zmh.builder.improve;

public class Client {
	public static void main(String[] args) {
		CommonHouse commonHouse = new CommonHouse();
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		houseDirector.constructHouse();
		
		HighBuilding highBuilding = new HighBuilding();
		houseDirector.setHouseBuilder(highBuilding);
		houseDirector.constructHouse();
	}
}
