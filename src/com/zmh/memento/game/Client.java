package com.zmh.memento.game;

public class Client {
	public static void main(String[] args) {
		//创建游戏角色
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);
		
		System.out.println("大战前状态");
		gameRole.display();
		
		//吧当前的状态保存起来
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(gameRole.createMemento());
		
		System.out.println("开始大战");
		gameRole.setVit(30);
		gameRole.setDef(30);
		gameRole.display();
		
		System.out.println("战后恢复");
		gameRole.recoverGameRole(caretaker.getMemento());
		gameRole.display();
	}
}
