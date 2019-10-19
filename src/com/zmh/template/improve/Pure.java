package com.zmh.template.improve;

public class Pure extends SoyaMilk{

	@Override
	void addCondiments() {}

	@Override
	boolean customerWantCondiments() {
		return false;
	}
}
