package com.cg.vehicleRegistration.ui;

import java.util.Scanner;

import com.cg.vehicleRegistration.beans.Details;
import com.cg.vehicleRegistration.exceptions.WrongAadharNumberException;
import com.cg.vehicleRegistration.exceptions.WrongMobileNumber;
import com.cg.vehicleRegistration.service.VehicleService;
import com.cg.vehicleRegistration.service.VehicleServiceImpl;

public class MainClass {
	static Scanner sc=new Scanner(System.in);
	static Details vehicle=new Details();
	static VehicleService service=new VehicleServiceImpl();
	public static void main(String[] args) {
		System.out.println("1) Vehicle Insurance Registration \n 2) Insurance Validity Check \n 3) Exit");
		while(true) {
			int ch=sc.nextInt();
			switch(ch) {
			case 1: System.out.println("enter vehicle no");
			 		vehicle.setVehicleNo(sc.nextInt());
			 		System.out.println("enter vehicle type");
			 		vehicle.setVehicleType(sc.nextInt());
			 		System.out.println("enter insurance period");
			 		vehicle.setInsurancePeriod(sc.nextInt());
			 		System.out.println("enter aadhar no");
			 		vehicle.setAadharNo(sc.nextLong());
			 		if(service.isValidAadhar(vehicle)) {
			 			try {
							throw new WrongAadharNumberException();
						} catch (WrongAadharNumberException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			 		}
			 		System.out.println("enter mobile no");
			 		vehicle.setMobileNo(sc.nextLong());
			 		vehicle.setAadharNo(sc.nextLong());
			 		if(service.isValidMobile(vehicle)) {
			 			try {
							throw new WrongMobileNumber();
						} catch ( WrongMobileNumber e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			 		}
			 		Details details=service.register(vehicle);
			 		System.out.println(details);
			 		System.out.println("vehicle registered successfully");
			 		break;
			case 2: System.out.println("enter vehicle no");
					int vehicleNo=sc.nextInt();
					Details details1=service.validityCheck(vehicle);
					System.out.println(details1.getInsurancePeriod());
					System.out.println(details1.getDateOfRenewal());
			}
		}

	}

}
