package com.masai;

import java.time.LocalDate;

public class Student{
	int roll;
	String name;
	String address;
	String dateOfBirth;
	
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Student(int roll, String name, String address, String string) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.dateOfBirth = string;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	public void print2(Student st) {
		System.out.println(st.getRoll());
		System.out.println(st.getName());
		System.out.println(st.getAddress());
		System.out.println(st.getDateOfBirth());	
	}


	public Student(Student st) {
	
		System.out.println(st);
		
		
	}
	
	
	
}



class Main {


public static void print(Student st) {
System.out.println(st.getRoll() +"  "+ st.getName() +"  "+st.getAddress() +"   "+st.getDateOfBirth());

}
	



	
	
public static void main(String[] args) {

Student st1	= new Student(34, "Aman", "Indore", "12/09/2000");
	
StudentService m1 = Main::print;
m1.printStudentDetails(st1);

StudentService m2 = st1::print2;
m2.printStudentDetails(st1);
	
StudentService m3 = Student::new;
m3.printStudentDetails(st1);





	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
