package com.zmh.command;

public class RemoteController {
	//开按钮命令数组
	Command[] onCommands;
	Command[] offCommands;
	
	//执行撤销的命令
	Command undoCommand;
	
	//构造器，完成按钮初始化
	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		
		for(int i = 0;i<5;i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	
	//给我们的按钮设置你需要的命令
	public void setCommand(int number,Command onCommand,Command offCommand) {
		onCommands[number] = onCommand;
		offCommands[number] = offCommand;
	}
	
	//按下开的按钮
	public void onButtonPushed(int number) {
		onCommands[number].execute();
		undoCommand = onCommands[number];
	}
	
	public void offButtonPushed(int number) {
		offCommands[number].execute();
		undoCommand = offCommands[number];
	}
	
	public void undoButtonPushed() {
		undoCommand.undo();
	}
}
