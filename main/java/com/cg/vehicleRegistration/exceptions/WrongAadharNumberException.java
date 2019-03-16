package com.cg.vehicleRegistration.exceptions;

public class WrongAadharNumberException extends Exception {
	public WrongAadharNumberException()
	{
		System.out.println("the aadhar number is not valid");
	}

}
