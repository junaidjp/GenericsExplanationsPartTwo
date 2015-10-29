package com.training.concepts;

import java.util.ArrayList;
import java.util.List;

public class ToyotaCarImplementing {
	
	public static void main(String arg[]) { 
		
		
		List<Toyota> toyotaCarUSA = new ArrayList<Toyota>(); 
		Toyota toyotacar = new Toyota();
		toyotacar.setCompanyName("Toyota USA");
		toyotacar.setHeadquarters("Michigan");
		String toyotamodels[] = { "camry","prius","lexus"};
		toyotacar.setModels(toyotamodels);
		toyotaCarUSA.add(toyotacar);
		
		CarInformation toyotaInfo = new CarInformation(toyotaCarUSA);
		toyotaInfo.returnModels(toyotacar);
		
	}

}
