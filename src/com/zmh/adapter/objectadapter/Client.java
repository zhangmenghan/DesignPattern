package com.zmh.adapter.objectadapter;

public class Client {
	public static void main(String[] args) {
		//对象适配器模式
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}
}
