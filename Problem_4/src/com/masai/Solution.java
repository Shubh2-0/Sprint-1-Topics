package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/* STREAM FEATURES
 * 
 * 1. We can perform the task in more easier and conscience way
 * 2. provide neat and clean code
 * 3. perform more operations and tasks in less code
 * 4. reduce code length
 * 
 * INTERMEDIATE METHODS (OPERATIONS) :  THIS TYPE OF METHOD BASICALLY RETURNING  
 * A NEW OBJECT OF STREAM
 * 
 * TERMINAL METHODS (OPERATIONS) : THIS TYPE OF METHOD BASICALLY RETURNING  
 * A PRIMITIVES , OBJECT , COLLECTION AND MAY NOT RETURN ANYTHING
 * 
 * 
 * 
 * 
 * 
 */








public class Solution {
	
	
	public static void main(String[] args) {
		
	List<Integer> numbers = new ArrayList<>();
	
	numbers.add(30);
	numbers.add(23);
	numbers.add(17);
	numbers.add(12);
	numbers.add(3);
	numbers.add(5);
	numbers.add(90);
	numbers.add(58);
	numbers.add(49);
	numbers.add(81);
	numbers.add(72);
	numbers.add(95);
	
	
	System.out.println("\n\n=========================INTERMEDIATE OPERATIONS=========================\n");
	
	Stream<Integer> s1 = numbers.stream().filter(e -> e%2==0);
	System.out.println("1. FILTER ");
	
	Stream<Integer> s2 = s1.map(e -> e-10);
	System.out.println("2. MAP ");
	
	Stream<Integer> s3 = s2.limit(5);
	System.out.println("3. LIMIT ");
	
	Stream<Integer> s4 = numbers.stream().distinct();
	System.out.println("4. DISTINCT ");
	
	
	System.out.println("\n\n\n\n\n=========================TERMINAL OPERATIONS=========================\n");
	
	System.out.println("1. MAX ");
	int max = numbers.stream().max(Integer::compare).get();
	System.out.println(max);
	
	System.out.println("\n2. MIN ");
	int min = numbers.stream().min(Integer::compare).get();
	System.out.println(min);
	
	
	System.out.println("\n3. COUNT ");
	int cou = (int) numbers.stream().count();
	System.out.println(cou);
	
	
	System.out.println("\n4. ANY MATCH ");
	boolean an = numbers.stream().anyMatch(e -> e>140);
	System.out.println(an);
	
	
	System.out.println("\n5. ALL MATCH ");
	boolean all = numbers.stream().allMatch(e -> e<1000);
	System.out.println(all);
	
	
	
	
	System.out.println("\n6. ForEach ");
	
	numbers.stream().forEach(e -> System.out.println(e));
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}
	

}
