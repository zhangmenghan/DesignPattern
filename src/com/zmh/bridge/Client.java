package com.zmh.bridge;

public class Client {
	public static void main(String[] args) {
		Phone phone = new FoldedPhone(new Xiaomi());
		phone.open();
		phone.call();
		phone.close();
	}
}
