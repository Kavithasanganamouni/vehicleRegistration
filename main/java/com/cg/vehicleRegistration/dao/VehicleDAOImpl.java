
		

package com.cg.vehicleRegistration.dao;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import com.cg.vehicleRegistration.beans.Details;
public class VehicleDAOImpl implements VehicleDAO {
	HashMap<Integer,Details>vehicleEntry;
		public Details register(Details vehicle) {
			vehicleEntry=new HashMap<Integer, Details>();
			int vehicleNo=vehicle.getVehicleNo();
			int vehicleType=vehicle.getVehicleType();
			int insurancePeriod=vehicle.getInsurancePeriod();
			LocalDate time=LocalDate.now();
			String dateOfReg=vehicle.setDateOfReg(time.toString());
			System.out.println(dateOfReg);
			String dateOfRenewal=vehicle.setDateOfRenewal(dateOfReg.concat(Integer.toString(insurancePeriod)));
			System.out.println(dateOfRenewal);
			//System.out.println(noOfDays);
			long aadhar=vehicle.getAadharNo();
			long mobile=vehicle.getMobileNo();
			for(Map.Entry m: vehicleEntry.entrySet()) {
				vehicle=((HashMap<Integer, Details>) m).put(vehicleNo,new Details(vehicleType,insurancePeriod,aadhar,
						mobile,dateOfReg,dateOfRenewal, insurancePeriod));
		}
		return vehicle;
	}

		public Details validityCheck(Details vehicle) {
			int vehicleNo=vehicle.getVehicleNo();
			for(Map.Entry m: vehicleEntry.entrySet()) {
				if(m.getKey().equals(vehicleNo)){
					int insurancePeriod=vehicle.getInsurancePeriod();
					String dateOfRenewal=vehicle.getDateOfRenewal();
				}
			}
			return vehicle;
		}

		public void setMobileNo(int i) {
			// TODO Auto-generated method stub
			
		}

}

