package com.training.app.model;

public class WaterVehicle extends Vehicle{

	private int sloran;
	public WaterVehicle(String price, String color, String brand, String licensePlate,int sloran) {
		super(price, color, brand, licensePlate);
		this.sloran=sloran;
		// TODO Auto-generated constructor stub
	}
	public int getSloran() {
		return sloran;
	}
	public void setSloran(int sloran) {
		this.sloran = sloran;
	}
	
	

}
