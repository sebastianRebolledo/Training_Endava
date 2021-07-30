package com.training.app.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Licensee {

	private ArrayList<Car> cars;
	private ArrayList<Motorcycle> motors;
	private ArrayList<Ship> ships;
	private CreateCar createCar;
	private CreateMotorcycle createMotorcycle;
	private CreateShip createShip;
	
	
	public Licensee(ArrayList<Car> cars, ArrayList<Motorcycle> motors, ArrayList<Ship> ships, CreateMotorcycle createMotorcycle, CreateCar createCar, CreateShip createShip) {
		super();
		this.cars = cars;
		this.motors = motors;
		this.ships=ships;
		this.createCar=createCar;
		this.createMotorcycle=createMotorcycle;
		this.createShip=createShip;
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

	public ArrayList<Ship> getShips() {
		return ships;
	}

	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}

	public CreateCar getCreateCar() {
		return createCar;
	}

	public void setCreateCar(CreateCar createCar) {
		this.createCar = createCar;
	}

	public CreateMotorcycle getCreateMotorcycle() {
		return createMotorcycle;
	}

	public void setCreateMotorcycle(CreateMotorcycle createMotorcycle) {
		this.createMotorcycle = createMotorcycle;
	}

	public CreateShip getCreateShip() {
		return createShip;
	}

	public void setCreateShip(CreateShip createShip) {
		this.createShip = createShip;
	}
	
	
	
	
	
	
}
