package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
	
	public static void main(String[] args) {
	
	List<String> studentName = new ArrayList<>();
	
	studentName.add("Dev");
	studentName.add("Mina");
	studentName.add("Jaya");
	studentName.add("Lakhan");
	studentName.add("Omkar");
	studentName.add("Aman");
	studentName.add("Harshit");
	studentName.add("Karan");
	studentName.add("Wetii");
	studentName.add("Qura");
	studentName.add("Zoba");
	studentName.add("Chinmay");
	studentName.add("Era");
	studentName.add("JayaK");
	studentName.add("Pranchal");
	studentName.add("Gona");
	studentName.add("Sachin");
	studentName.add("Zen");
	
	
	
	List<String> studentName2 = studentName.stream()
			                   .filter(e -> e.length()%2==0)
			                   .map(e -> e.toUpperCase())
			                   .limit(10)
			                   .collect(Collectors.toList());
	
//	studentName2.sort((o1,o2) -> o2.compareTo(o1));
	Collections.sort(studentName2, (o1,o2) -> o2.compareTo(o1));
	
	
	System.out.println("=================ORIGINAL LIST=================\n");
	studentName.forEach(e -> System.out.println(e));
	
	
	
	System.out.println("\n\n\n=================TRASFORMED LIST=================\n");	
	studentName2.forEach(e -> System.out.println(e));	
		
		
		
	}

}
