package com.cg.vehicleRegistration.dao;

import com.cg.vehicleRegistration.beans.Details;

public interface VehicleDAO {
	public Details register(Details vehicle);
	public Details validityCheck(Details vehicle);
	public void setMobileNo(int i);
}
