package com.zmh.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V{

	@Override
	public int output5V() {
		//获取到220伏的电压
		int srcV = output220V();
		int detV = srcV / 44;
		return detV;
	}

}
