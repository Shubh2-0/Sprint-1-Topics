package com.masai;

import java.time.LocalDate;

public class Solution {
	
	
	public Solution(Student st) {
		
		System.out.println(st);
		System.out.println("INSIDE CONSTRUCTOR");
	}
	
	public static void printStatic(Student st) {
	
		System.out.println(" ROLL NUMBER : "+st.getRoll()+
				           "\n NAME : "+st.getName()+
				           "\n ADDRESS : "+st.getAddress()+
				           "\n DOB : "+st.getDateOfBirth());
		
		
	}
	public void printNonStatic(Student st) {
		
		System.out.println(" ROLL NUMBER : "+st.getRoll()+
				           "\n NAME : "+st.getName()+
				           "\n ADDRESS : "+st.getAddress()+
				           "\n DOB : "+st.getDateOfBirth());
		
		
	}
	
	
	

	public static void main(String[] args) {
	
	Student st = new Student(1, "Omkar", "Mumbai", LocalDate.parse("1999-02-23"));
	
	
	 System.out.println("\n\n================BY STATIC METHOD REFERENCE================\n");
	
	StudentService s1 = Solution::printStatic;
	
	 s1.printStudentDetails(st);
	
	 
	 System.out.println("\n\n================BY NON STATIC METHOD REFERENCE================\n");
	 
	 Solution s = new Solution(st);

tic;
    
    s2.printStudentDetails(st);
    
    
   
    
    
    StudentService s3 = Solution::new;
    
    s3.printStudentDetails(st);
    

    
	
		
		
		
		
		
		
	}
	
}
