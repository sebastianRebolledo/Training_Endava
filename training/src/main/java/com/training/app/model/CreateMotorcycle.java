package com.training.app.model;

public class CreateMotorcycle {

	private Licensee licensee;
	
	public void registerMotorcycle(String price, String color, String brand, String licensePlate, int type,boolean direction){
		Motorcycle mtr = new Motorcycle(price, color, brand, licensePlate, type,direction);
		licensee.getMotors().add(mtr);
	}
	
	
}
