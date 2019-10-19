package com.zmh.command;

public class TVOffCommand implements Command{

	//聚合LightRecevier
	
	TVReceiver tvReceiver;
	
	//构造器
	public TVOffCommand(TVReceiver tvReceiver) {
		this.tvReceiver = tvReceiver;
	}
	
	@Override
	public void execute() {
		tvReceiver.off();
	}

	@Override
	public void undo() {
		tvReceiver.on();
	}
	
}
