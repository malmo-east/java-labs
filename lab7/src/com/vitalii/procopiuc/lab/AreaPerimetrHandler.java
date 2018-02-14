package com.vitalii.procopiuc.lab;



public class AreaPerimetrHandler {
	private float length;
	private float width;

	public AreaPerimetrHandler() {
		this.setLength(1);
		
		this.setWidth(1);
	}

	public float getLength() {
			return length;
	}

	public void setLength(float length) {

		if (length > 0.0 && length < 20.0) {
			this.length = length;
		}
	}

	public float getHight() {
		return width;
	}

	public void setWidth(float hight) {
		if (hight > 0.0 && hight < 20.0) {
			this.width = hight;
		}
	}

	public float area() {
		float res = 0;
		
		res = getHight() * getLength();
		
		return res;
	}

	public float per() {
		float res = 0;
			
		res = 2 * (getHight() + getLength());
			
		return res;
	}
}