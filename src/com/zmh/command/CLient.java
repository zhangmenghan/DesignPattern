package com.zmh.command;

public class CLient {
	public static void main(String[] args) {
		LightReceiver lightReceiver = new LightReceiver();
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		RemoteController remoteController = new RemoteController();
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		System.out.println("----------on----------");
		remoteController.onButtonPushed(0);
		System.out.println("----------off----------");
		remoteController.offButtonPushed(0);
		System.out.println("----------undo----------");
		remoteController.undoButtonPushed();
		
		TVReceiver tvReceiver = new TVReceiver();
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		System.out.println("----------on----------");
		remoteController.onButtonPushed(1);
		System.out.println("----------off----------");
		remoteController.offButtonPushed(1);
		System.out.println("----------undo----------");
		remoteController.undoButtonPushed();
	}
}
