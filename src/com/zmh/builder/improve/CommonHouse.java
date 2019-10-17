package com.zmh.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("common house build basic");
	}

	@Override
	public void buildWalls() {
		System.out.println("common house build walls");
	}

	@Override
	public void roofed() {
		System.out.println("common house roofed");
	}

}
