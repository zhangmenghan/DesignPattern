package com.zmh.adapter.objectadapter;

public class VoltageAdapter implements Voltage5V{

	private Voltage220V voltage220V;
	
	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V = voltage220V;
	}
	
	@Override
	public int output5V() {
		int dst = 0;
		if(null != voltage220V) {
			int src = voltage220V.output220V();
			dst = src / 44;
		}
		return dst;
	}

}
