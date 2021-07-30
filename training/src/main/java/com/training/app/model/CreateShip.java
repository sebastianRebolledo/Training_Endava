package com.training.app.model;

public class CreateShip {

	public Ship registerShip(String price, String color, String brand, String licensePlate, int sloran){
		Ship newShip = new Ship(price, color, brand, licensePlate, sloran);
		return newShip;
	}
	
	
}
