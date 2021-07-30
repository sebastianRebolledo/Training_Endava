package com.training.app.model;

import com.ttraining.app.interfaces.ISpeedUp;
import com.ttraining.app.interfaces.ITurnOff;
import com.ttraining.app.interfaces.ITurnOn;

import lombok.Data;


public class Car extends LandVehicle implements ITurnOn,ITurnOff,ISpeedUp{

	
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
