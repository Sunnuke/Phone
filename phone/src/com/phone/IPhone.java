package com.phone;

public class IPhone extends Phone implements Ringable  {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
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
