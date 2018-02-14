package com.vitalii.procopiuc.lab;

public class AreaPerimetr extends AreaPerimetrHandler {

	public static void main(String[] args) {
		AreaPerimetrHandler rect = new AreaPerimetrHandler();
		rect.setWidth(15);
		rect.setLength(5);
		System.out.println(	rect.area()+"\n"
							+ rect.per());
	}

}
