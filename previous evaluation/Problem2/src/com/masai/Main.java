package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
private int roll;
private String name;
private int marks;
private String address;
public Student(int roll, String name, int marks, String address) {
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
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
	return "Roll=" + roll + "\tName=" + name + "\tMarks=" + marks + "\tAddress=" + address + "\n";
}


	
	
}


class Employee{

private int empId;
private String name;
private int salary;
private String address;
public Employee(int empId, String name, int salary, String address) {
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
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
	return "EmpId=" + empId + "\tName=" + name + "\tSalary=" + salary + "\tAddress=" + address + "\n";
}	





}







public class Main {

public static void main(String[] args) {
	
List<Student> list = new ArrayList<>();

list.add(new Student(2, "Aman", 450, "Jaipur"));
list.add(new Student(3, "Boby", 650, "Ujjain"));
list.add(new Student(4, "Dev", 550, "Ratlam"));
list.add(new Student(5, "Yash", 750, "Udaipur"));
list.add(new Student(7, "Akash", 250, "Dewas"));


List<Employee> list1 = list.stream().filter(i -> i.getMarks() > 500 ).map( i -> new Employee(i.getRoll(),i.getName(), i.getMarks()*10000, i.getAddress())).collect(Collectors.toList());

//System.out.println(list1);	

list1 = list1.stream().sorted((i1,i2)->i2.getSalary()-i1.getSalary()).collect(Collectors.toList());

list1.forEach(e->System.out.print(e));

System.out.println("\n##########\n");

list.forEach(e->System.out.print(e));




}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
