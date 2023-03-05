package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

public static void main(String[] args) {
	
List<String> nameStrings = new ArrayList<>();

nameStrings.add("Shubham");
nameStrings.add("Aman");
nameStrings.add("Kunal");
nameStrings.add("Manish");
nameStrings.add("Zen");
nameStrings.add("Jayant");
nameStrings.add("Pablu");
nameStrings.add("Dev");
nameStrings.add("Boby");
nameStrings.add("Shiv");


List<String> even = nameStrings.stream().filter(i-> i.length()%2==0).collect(Collectors.toList());
even = even.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
	
Collections.sort(even,(i2,i3) -> i3.compareTo(i2));

nameStrings.forEach(e-> System.out.println(e));

System.out.println("############################  AFTER OPERATIONS #######################################");

even.forEach(e->System.out.println(e));


	
	
}	
	
	
}
