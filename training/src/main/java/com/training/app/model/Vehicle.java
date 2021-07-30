package com.training.app.model;

public class Vehicle {



	private String price;
	private String color;
	private String brand;
	private String licensePlate;

	public Vehicle(String price, String color, String brand, String licensePlate) {
		super();
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.licensePlate = licensePlate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
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
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	


	
}
