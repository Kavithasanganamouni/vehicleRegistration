package com.cg.vehicleRegistration.service;


import com.cg.vehicleRegistration.beans.Details;
import com.cg.vehicleRegistration.dao.VehicleDAO;
import com.cg.vehicleRegistration.dao.VehicleDAOImpl;
import com.cg.vehicleRegistration.exceptions.WrongAadharNumberException;
import com.cg.vehicleRegistration.exceptions.WrongMobileNumber;

public class VehicleServiceImpl implements VehicleService{
	public boolean isValidAadhar(Details vehicle) {
		if(Long.toString(vehicle.getAadharNo()).length()!=12) {
			return true;
		}
		else
		return false;
	}

	
	public boolean isValidMobile(Details vehicle) {
		if(Long.toString(vehicle.getMobileNo()).length()!=10) {
			return true;
		}
		else
		return false;
	}
	public Details register(Details vehicle) {
		
		VehicleDAO vehicledao=new VehicleDAOImpl();
		return vehicledao.register(vehicle);}
	
		//return vehicle;
	
	public Details validityCheck(Details vehicle) {
		
		return null;
	}

}
