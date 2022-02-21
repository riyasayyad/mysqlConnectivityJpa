package com.example.demo;

public class Car {
	private int CarID;
	private String CarName;
	public int getCarID() {
		return CarID;
	}
	public void setCarID(int carID) {
		CarID = carID;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	@Override
	public String toString() {
		return "Car1 [CarID=" + CarID + "]";
	}

}
