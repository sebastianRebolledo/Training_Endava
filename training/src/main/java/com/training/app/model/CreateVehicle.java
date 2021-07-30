package com.training.app.model;

public class CreateVehicle {
	
	public void registerVehicle(String price, String color, String brand, String licensePlate, int type){
		Vehicle newVehicle= new Vehicle (price,color, brand,licensePlate);
	}

}
