package com.training.app.model;

import com.ttraining.app.interfaces.IFloatUp;
import com.ttraining.app.interfaces.ISpeedUp;
import com.ttraining.app.interfaces.ITurnOff;
import com.ttraining.app.interfaces.ITurnOn;

public class Ship extends WaterVehicle implements IFloatUp,ITurnOn,ITurnOff,ISpeedUp{
	private int sloran;

	public Ship(String price, String color, String brand, String licensePlate, int sloran) {
		super(price, color, brand, licensePlate);
		this.sloran=sloran;
		// TODO Auto-generated constructor stub
	}
	
	public int getSloran() {
		return sloran;
	}
	public void setSloran(int sloran) {
		this.sloran = sloran;
	}
	
	@Override
	public void floatUp() {
		System.out.println("The vehicle is floating");
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
