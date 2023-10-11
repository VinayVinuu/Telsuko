package com.vinay.Telsuko;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile{
	public void drive() {
		System.out.print("Bike start ayindi");
	}

}
