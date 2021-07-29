package com.training.app.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Licensee {

	private ArrayList<Car> cars;

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	
	
	
	
}
