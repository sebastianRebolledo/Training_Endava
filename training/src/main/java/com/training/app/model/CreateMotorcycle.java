package com.training.app.model;

public class CreateMotorcycle {

	
	public Motorcycle registerMotorcycle(String price, String color, String brand, String licensePlate, int type,boolean direction){
		Motorcycle mtr = new Motorcycle(price, color, brand, licensePlate, type,direction);
		return mtr;
	}
	
	
}
