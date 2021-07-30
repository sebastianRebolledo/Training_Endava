package com.training.app;

import java.util.ArrayList;

import com.training.app.model.Car;
import com.training.app.model.CreateCar;
import com.training.app.model.CreateMotorcycle;
import com.training.app.model.CreateShip;
import com.training.app.model.Licensee;
import com.training.app.model.Motorcycle;
import com.training.app.model.Ship;
import com.training.app.model.Vehicle;

public class App 
{
    public static void main( String[] args ) {
    	
    	
    	ArrayList<Car> cars = new ArrayList<>();
    	ArrayList<Motorcycle> motors = new ArrayList<>();
    	ArrayList<Ship> ships = new ArrayList<>();
    	ArrayList<Vehicle> vehicles = new ArrayList<>();
    	CreateCar createCar=new CreateCar();
    	CreateMotorcycle createMotorcycle= new CreateMotorcycle();
    	CreateShip createShip = new CreateShip();

    	Licensee licensee = new Licensee(cars,motors,ships,createMotorcycle,createCar,createShip);
    	
    	Car car1 = licensee.getCreateCar().registerCar("10.000", "blue", "Chevrolet", "A0045", 1, false);
    	Car car2 = licensee.getCreateCar().registerCar("10.000", "black", "Ford", "A0045", 1, false);
    	cars.add(car1);
    	cars.add(car2);
    	

    	Motorcycle motor1 = licensee.getCreateMotorcycle().registerMotorcycle("178.00", "Red", "Yamaha", "sr65", 2, true) ;
    	Motorcycle motor2 = licensee.getCreateMotorcycle().registerMotorcycle("178.87", "Black", "Akt", "aw34", 2, true) ;
    	motors.add(motor1);
    	motors.add(motor2);
    	
    	Ship ship1 = licensee.getCreateShip().registerShip("123.988", "Red", "ShipsBrand","a876", 2);
    	ships.add(ship1);
    	
    	for (int i = 0; i < cars.size(); i++) {
			vehicles.add(cars.get(i));
		}
    	
    	for (int i = 0; i < motors.size(); i++) {
			vehicles.add(motors.get(i));
		}
    	
    	for (int i = 0; i < ships.size(); i++) {
			vehicles.add(ships.get(i));
		}
    	
    	
    	for (int i = 0; i < vehicles.size(); i++) {
			System.out.println(vehicles.get(i).getBrand());
		}
    	
   
    	
    	
    	
    	


    	
    }
}
