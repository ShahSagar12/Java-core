package com.sagar.strategy.impl;

import com.sagar.strategy.Plann;

public class Emergency implements Plann {

	@Override
	public void doAction() {
		System.out.println("Call the Headquarter: Say Send the Air Ambulance");

	}

}
