package com.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy note10 = new Galaxy("Note 10+", 100, "T-Mobile", "Ringa! Ringa!");
		IPhone iphone10 = new IPhone("iphone X", 100, "Verizon", "Teet! Teet! Teet!");
		
		note10.displayInfo();
		System.out.println(note10.ring(note10.getRing()));
		System.out.println(note10.unlock());
		
		iphone10.displayInfo();
		System.out.println(iphone10.ring(iphone10.getRing()));
		System.out.println(iphone10.unlock());
	}

}
