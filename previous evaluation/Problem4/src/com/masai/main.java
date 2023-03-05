package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

public static void main(String[] args) {
	
	
List<Integer> arr1 = new ArrayList<>();
arr1.add(1);
arr1.add(11);
arr1.add(21);
arr1.add(10);
arr1.add(2);
arr1.add(5);
arr1.add(3);
arr1.add(7);
arr1.add(4);

Stream<Integer> st1 = arr1.stream();
//terminal methods 
st1.forEach(e->System.out.println(e));


//terminal methods 
List<Integer> arr2 = st1.filter(i->i%2==0).collect(Collectors.toList());

List<Integer> st2 = arr2.stream().filter(i -> i > 10).collect(Collectors.toList());

	
	
}	
	
	
}
