package com.training.app.model;

public class CreateCar {
	
	
	public Car registerCar(String price, String color, String brand, String licensePlate, int type,boolean airbags){
		Car car = new Car(price, color, brand, licensePlate, type,airbags);
		return car;
	}

}
