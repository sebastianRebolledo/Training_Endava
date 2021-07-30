package com.training.app.model;

import com.ttraining.app.interfaces.ITurnOff;
import com.ttraining.app.interfaces.ITurnOn;

public class Button {
	
	private ITurnOff iTurnOff;
	private ITurnOn iTurnOn;
	
	public Button(ITurnOff iTurnOff, ITurnOn iTurnOn){
		this.iTurnOff=iTurnOff;
		this.iTurnOn=iTurnOn;
		
	}
	
	public void pressOff() {
    iTurnOff.turnOffVehicle();
	}
	
	public void pressOn() {
		iTurnOn.turnOnVehicle();
	}
	
	
}