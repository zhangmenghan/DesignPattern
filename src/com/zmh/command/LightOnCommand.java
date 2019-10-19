package com.zmh.command;

public class LightOnCommand implements Command{

	//聚合LightRecevier
	
	LightReceiver lightReceiver;
	
	//构造器
	public LightOnCommand(LightReceiver lightReceiver) {
		this.lightReceiver = lightReceiver;
	}
	
	@Override
	public void execute() {
		lightReceiver.on();
	}

	@Override
	public void undo() {
		lightReceiver.off();
	}
	
}
