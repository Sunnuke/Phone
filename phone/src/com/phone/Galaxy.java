package com.phone;

public class Galaxy extends Phone implements Ringable  {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public String ring() {
		return ring();
	}
	public String unlock() {
		return unlock();
	}
	public void displayInfo() {
		this.displayInfo();
	}
}
