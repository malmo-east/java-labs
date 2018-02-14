package com.vitalii.procopiuc.lab;

public class TrafficLights{

	public static void main(String[] args) {
		
		TrafficLightsHandler red = TrafficLightsHandler.RED;
		System.out.printf("%s \t%s\n",red.name(),red.duration());
		TrafficLightsHandler green = TrafficLightsHandler.GREEN;
		System.out.printf("%s \t%s\n",green.name(),green.duration());
		TrafficLightsHandler yellow = TrafficLightsHandler.YELLOW;
		System.out.printf("%s \t%s\n",yellow.name(),yellow.duration());

	}

}
