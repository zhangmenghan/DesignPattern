package com.zmh.command;

public class LightOffCommand implements Command{

	//聚合LightRecevier
	
	LightReceiver lightReceiver;
	
	//构造器
	public LightOffCommand(LightReceiver lightReceiver) {
		this.lightReceiver = lightReceiver;
	}
	
	@Override
	public void execute() {
		lightReceiver.off();
	}

	@Override
	public void undo() {
		lightReceiver.on();
	}
	
}
