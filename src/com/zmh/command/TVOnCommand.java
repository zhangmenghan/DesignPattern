package com.zmh.command;

public class TVOnCommand implements Command{

	//聚合LightRecevier
	
	TVReceiver tvReceiver;
	
	//构造器
	public TVOnCommand(TVReceiver tvReceiver) {
		this.tvReceiver = tvReceiver;
	}
	
	@Override
	public void execute() {
		tvReceiver.on();
	}

	@Override
	public void undo() {
		tvReceiver.off();
	}
	
}
