package com.training.app.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Licensee {

	private ArrayList<Car> cars;
	private ArrayList<Motorcycle> motors;
	
	
	public Licensee(ArrayList<Car> cars, ArrayList<Motorcycle> motors) {
		super();
		this.cars = cars;
		this.motors = motors;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public ArrayList<Motorcycle> getMotors() {
		return motors;
	}

	public void setMotors(ArrayList<Motorcycle> motors) {
		this.motors = motors;
	}
	
	
	
	
	
	
}
