package com.vitalii.procopiuc.lab;

public enum TrafficLightsHandler {

	RED(123), 
	GREEN(2123), 
	YELLOW(3412);
	private final int dlitelnost;
	TrafficLightsHandler(int duration){
		this.dlitelnost = duration;
	}
	public int duration() {
		return dlitelnost;
	
	}	
	
}
