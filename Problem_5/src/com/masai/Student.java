package com.masai;

import java.time.LocalDate;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private LocalDate dateOfBirth;
	
	
	public Student() {

	}


	public Student(int roll, String name, String address, LocalDate dateOfBirth) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "RollNo.  : " + roll + "      Name : " + name + "      Address : " + address + "      Date Of Birth : " + dateOfBirth;
	}
	
	
	
	
	
	
	
	

	
	

}
