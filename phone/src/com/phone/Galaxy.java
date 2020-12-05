package com.phone;

public class Galaxy extends Phone implements Ringable  {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring(String ring) {
		ringTone = ring;
		return ring;
	}

	@Override
	public String unlock() {
		return "Phone Unlocked!";
	}

	@Override
	public void displayInfo() {
		System.out.println("Version Number: " + this.getVer() + " |Battery Percentage: " + this.getBat() + " |Carrier: " + this.getCarr() + " |Ring Tone: " + this.getRing());
	}

}
