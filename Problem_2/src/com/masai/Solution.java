package com.masai;

import java.util.ArrayList;import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Student{

	private int roll;
	private String name;
	private double marks;
	private String address;
	
	
	public Student() {
	
	}


	public Student(int roll, String name, double marks, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
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


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student RollNo. : " + roll + "    Name : " + name + "    Marks : " + marks + "    Address : " + address;
	}
	
	
	
	
	
	
}



class Employee{
	
	private int empId;
	private String name;
	private double salary;
	private String address;
	
	
	public Employee() {
	
	}


	public Employee(int empId, String name, double salary, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee ID : " + empId + "    Name : " + name + "    Salary : " + salary + "    Address : " + address;
	}
	
	
	
	
	
	
	
	
	
}




public class Solution {
	
	public static void main(String[] args) {
		
	List<Student> studentList = new ArrayList<>();
	
	studentList.add(new Student(1, "Aman", 340.7, "Ujjain"));
	studentList.add(new Student(2, "Pankaj", 560, "Indore"));
	studentList.add(new Student(3, "Jayant", 690, "Goa"));
	studentList.add(new Student(4, "Hemant", 470, "Mumbai"));
	studentList.add(new Student(5, "KAran", 291.67, "Dewas"));
	
	List<Employee> employeesList = studentList.stream()
			                        .filter(e -> e.getMarks() > 500)
			                        .map(st -> new Employee(st.getRoll(),st.getName(),st.getMarks()*10000,st.getAddress()))
			                        .collect(Collectors.toList());
			

	List<Employee> employeesList2 = employeesList.stream()
			                        .map(e -> e)
			                        .collect(Collectors.toList());			                    
	
	
	Collections.sort(employeesList2 , (o1,o2) -> (int)o2.getSalary() - (int)o1.getSalary());
	
	
	System.out.println("===================EMPLOYEE LIST===================\n");
	
	employeesList2.forEach( e -> System.out.println(e));
	
	
	
	
	System.out.println("\n\n\n===================STUDENT LIST===================\n");
	
	studentList.forEach(e -> System.out.println(e));
	
	
	
		
		
		
	}

}































