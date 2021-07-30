package com.training.app.model;

import lombok.Data;


public class Car extends LandVehicle{

	
	private boolean airbags;
	public Car(String price, String color, String brand, String licensePlate, int type,boolean airbags) {
		super(price, color, brand, licensePlate, type);
		this.airbags=airbags;
		// TODO Auto-generated constructor stub
	}
	public boolean isAirbags() {
		return airbags;
	}
	public void setAirbags(boolean airbags) {
		this.airbags = airbags;
	}
	
	
	

	
	
}
