package com.sagar.model;

import com.sagar.strategy.Plann;

public class Context {
	private Plann plann;
	
	public Context(Plann plann) {
		this.plann=plann;
		
	}

	public void executePlann() {
		plann.doAction();
	}
}
