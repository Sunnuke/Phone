package com.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	protected String ringTone;
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	public abstract void displayInfo();
	public String getVer() {
		return this.versionNumber;
	}
	public int getBat() {
		return this.batteryPercentage;
	}
	public String getCarr() {
		return this.carrier;
	}
	public String getRing() {
		return this.ringTone;
	}
}
