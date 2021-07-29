package com.training.app.model;

import lombok.Data;

@Data
public class Car {

	public static final int GAS=1;
	public static final int ELECTRIC=1;
	public static final int GASOLINE=1;


	private String plate;
	private String color;
	private String brand;
	private int modelo;
	private int type;
	public Car(String plate, String color, String brand, int modelo, int type) {
		super();
		this.plate = plate;
		this.color = color;
		this.brand = brand;
		this.modelo = modelo;
		this.type = type;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
	public void turnOnCar() {
		System.out.println("The car started");
	}
	
	public void turnOffcar() {
		System.out.println("The car turned off");
	}
	
	public void acelerar() {
		System.out.println("The car has sped up");
	}
}
