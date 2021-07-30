package com.training.app.model;

public class Motorcycle extends LandVehicle {

	private boolean direction;
	public Motorcycle(String price, String color, String brand, String licensePlate, int type,boolean direction) {
		super(price, color, brand, licensePlate, type);
		this.direction=direction;
		// TODO Auto-generated constructor stub
	}
	public boolean isDirection() {
		return direction;
	}
	public void setDirection(boolean direction) {
		this.direction = direction;
	}

	
	
}
