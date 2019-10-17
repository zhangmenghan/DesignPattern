package com.zmh.builder.improve;

public class HighBuilding extends HouseBuilder{

	@Override
	public void buildBasic() {
		System.out.println("high building build basic");
	}

	@Override
	public void buildWalls() {
		System.out.println("high building build walls");
	}

	@Override
	public void roofed() {
		System.out.println("high building roofed");
	}
	
}
