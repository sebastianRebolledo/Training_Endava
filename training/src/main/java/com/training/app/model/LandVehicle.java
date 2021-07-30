package com.training.app.model;

public class LandVehicle extends Vehicle {
	
	public static final int GAS=1;
	public static final int ELECTRIC=1;
	public static final int GASOLINE=1;
	
	private int type;
	public LandVehicle(String price, String color, String brand, String licensePlate,int type) {
		super(price, color, brand, licensePlate);
		this.type=type;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	
	


}
