package com.training.concepts;

import java.util.ArrayList;
import java.util.List;

public class NissanCarImplementing {


	public static void main(String arg[]) { 
		
		
		List<Nissan> nissanCarUSA = new ArrayList<Nissan>(); 
		Nissan nissanCar = new Nissan();
		nissanCar.setCompanyName("Nissan UK");
		nissanCar.setHeadquarters("London");
		String nissanModels[] = { "Altima","370z","Maxima"};
		nissanCar.setModels(nissanModels);
		nissanCarUSA.add(nissanCar);
		//CarInformation carInfo = new CarInformation(nissanCarUSA);
		//Remove the comment on the above Line
		carInfo.returnModels(nissanCar);
		
	}

	
}
