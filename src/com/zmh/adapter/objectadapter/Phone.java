package com.zmh.adapter.objectadapter;

public class Phone {
	//充电
	public void charging(Voltage5V voltage5v) {
		if(voltage5v.output5V() == 5) {
			System.out.println("电压为5伏,可以充电");
		}else if(voltage5v.output5V() > 5) {
			System.out.println("电压大于5伏,不能充电");
		}else if(voltage5v.output5V() < 5) {
			System.out.println("电压小于5伏,不能充电");
		}
	}
}
