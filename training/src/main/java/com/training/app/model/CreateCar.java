package com.training.app.model;

public class CreateCar {
	
	public void registerCar(String plate, String color, String brand, int modelo, int type){
		Car newCar= new Car(plate, color, brand, modelo, type);
	}

}
