package com.vinay.Telsuko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vechile{
	
	@Autowired  // go to xml and check instance of wire
	private tyre tyre;
	
	
	public tyre getTyre() {
		return tyre;
	}


	public void setTyre(tyre tyre) {
		this.tyre = tyre;
	}


	public void drive() {
		System.out.print("Car " + tyre);
		
	}

}
