package com.cg.vehicleRegistration.beans;

import com.cg.vehicleRegistration.dao.VehicleDAO;

public class Details {
	private int vehicleNo;
	private int vehicleType;
	private int insurancePeriod;
	private long aadharNo;
	private long mobileNo;
	private String dateOfReg;
	private String dateOfRenewal;
	private int noOfDaysLeft;
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDateOfRenewal() {
		return dateOfRenewal;
	}
	public String setDateOfRenewal(String dateOfRenewal) {
		return this.dateOfRenewal = dateOfRenewal;
	}
	public String getDateOfReg() {
		return dateOfReg;
	}
	public String setDateOfReg(String dateOfReg) {
		return this.dateOfReg = dateOfReg;
	}
	public int getNoOfDaysLeft() {
		return noOfDaysLeft;
	}
	public void setNoOfDaysLeft(int noOfDaysLeft) {
		this.noOfDaysLeft = noOfDaysLeft;
	}
	public Details(int vehicleType, int insurancePeriod, long aadharNo, long mobileNo, String dateOfReg,
			String dateOfRenewal, int noOfDaysLeft) {
		super();
		this.vehicleType = vehicleType;
		this.insurancePeriod = insurancePeriod;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
		this.dateOfReg = dateOfReg;
		this.dateOfRenewal = dateOfRenewal;
		this.noOfDaysLeft = noOfDaysLeft;
	}
	public Details() {
		// TODO Auto-generated constructor stub
	}
	public void register(VehicleDAO vehicledao) {
		// TODO Auto-generated method stub
		
	}
}

