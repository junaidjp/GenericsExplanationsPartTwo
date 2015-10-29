package com.training.concepts;

import java.util.List;

public class CarInformation  extends Car {

	public CarInformation(List<Toyota> cars) {
		super(cars);
		
	}
	
	
	public Object getCars() { 
		return cars;
	}

 public void returnModels(Object car) { 
	 
	 if(car instanceof Toyota) { 
		Toyota toyotacar = (Toyota) car; 
		String models[] = toyotacar.getModels();
		
		for(int i = 0; i < models.length; i ++ ) { 
			System.out.println(models[i]);
		}
	 }
	 
 }

}
