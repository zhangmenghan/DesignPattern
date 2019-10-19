package com.zmh.template;

public abstract class SoyaMilk {
	//模板方法,做成final,不让子类覆盖
	final void make() {
		select();
		addCondiments();
		soak();
		beat();
	}
	
	//选材料
	private void select() {
		System.out.println("第一步：选择新鲜的黄豆");
	}
	
	//添加不同的配料,子类具体实现
	abstract void addCondiments();

	//浸泡
	private void soak() {
		System.out.println("第三步:开始浸泡");
	}
	
	//
	private void beat() {
		System.out.println("第四步：开始进行打碎");
	}
}
