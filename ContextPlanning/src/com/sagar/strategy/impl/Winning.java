package com.sagar.strategy.impl;

import com.sagar.strategy.Plann;

public class Winning implements Plann {

	@Override
	public void doAction() {
		System.out.println("Keep Chasing until none exist");

	}

}
