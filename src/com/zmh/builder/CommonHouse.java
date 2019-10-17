package com.zmh.builder;

public class CommonHouse extends AbstractHouse {

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
