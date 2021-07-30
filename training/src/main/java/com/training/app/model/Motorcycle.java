package com.training.app.model;

import com.ttraining.app.interfaces.ISpeedUp;
import com.ttraining.app.interfaces.ITurnOff;
import com.ttraining.app.interfaces.ITurnOn;

public class Motorcycle extends LandVehicle implements ITurnOn,ITurnOff,ISpeedUp {

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

	
	@Override
	public void speedUp() {
		System.out.println("The car has sped up");
		
	}
	@Override
	public void turnOffVehicle() {
		System.out.println("The Vehicle turned off");
		
	}
	@Override
	public void turnOnVehicle() {
		System.out.println("The Vehicle has been started");
		
	}

	
	
}
