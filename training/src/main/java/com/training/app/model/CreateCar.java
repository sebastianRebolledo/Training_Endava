package com.training.app.model;

public class CreateCar {
	
private Licensee licensee;
	
	public void registerCar(String price, String color, String brand, String licensePlate, int type,boolean airbags){
		Car car = new Car(price, color, brand, licensePlate, type,airbags);
		licensee.getCars().add(car);
	}

}
