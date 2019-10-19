package com.zmh.command;

//每一个命令空执行,用于初始化每个按钮,当调用空命令时,对象什么都不做
//是一种设计模式,可以省掉空判断
public class NoCommand implements Command{

	@Override
	public void execute() {}

	@Override
	public void undo() {}

}
