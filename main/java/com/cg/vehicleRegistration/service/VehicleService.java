package com.cg.vehicleRegistration.service;

import com.cg.vehicleRegistration.beans.Details;

public interface VehicleService {
	public Details register(Details vehicle);
	public Details validityCheck(Details vehicle);
	public boolean isValidAadhar(Details vehicle);
	public boolean isValidMobile(Details vehicle);
	

}
