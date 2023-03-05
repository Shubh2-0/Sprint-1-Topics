package com.masai;


import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;



class comparater implements Comparator<Grocery>{

	@Override
	public int compare(Grocery o1, Grocery o2) {
	
	int h = (int) (o1.getPrice()-o2.getPrice());	
	
	if(h<0)
		return -1;

	else if(h > 0)
		return 1;
	
	else {
		
		h = (int) (o1.getUsedFrequency()-o2.getUsedFrequency());
		
		if(h < 0)
			return -1;
		
		else if(h > 0)
			return 1;
		
		else {
			
			return o1.getName().compareTo(o2.getName());
			
		}
		
		
		
	}
		
		
		
		
	}
	
	
	
	
	
	
}

class Grocery implements Comparable<Grocery>{
	
	private double price;
	private String name;
	private double usedFrequency;
	public Grocery(double price, String name, double usedFrequency) {
		super();
		this.price = price;
		this.name = name;
		this.usedFrequency = usedFrequency;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUsedFrequency() {
		return usedFrequency;
	}
	public void setUsedFrequency(double usedFrequency) {
		this.usedFrequency = usedFrequency;
	}
	@Override
	public String toString() {
		return "Grocery Price : " + price + "    Name : " + name + "    Used_Frequency : " + usedFrequency;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price, usedFrequency);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grocery other = (Grocery) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(usedFrequency) == Double.doubleToLongBits(other.usedFrequency);
	}
	@Override
	public int compareTo(Grocery o) {
	
	int c = (int) (this.getUsedFrequency() - o.getUsedFrequency());
	
	if(c > 0)
		return -1;
	
	else if(c < 0)
		return 1;
	
	else {
		
	c = (int) (this.getPrice() - o.getPrice());	
	
	
	if( c > 0)
		
		return -1;
	
	else if(c < 0)
		
		return 1;
	
	else {
		
	c = this.getName().compareTo(o.getName());
	
	
	if(c > 0)
		return -1;
	
	else if(c < 0)
		return 1;
	
	else 
		return 0;
	
	
		
		
		
		
	}
	
		
		
		
	}
	
		
		
		
		
		
	}
	
	
  	
	
	
	
	
}









public class Solution {

	public static void main(String[] args) {
		
	Set<Grocery> set = new TreeSet<>();
	
	set.add(new Grocery(100, "Colgate", 2));
	set.add(new Grocery(400, "Tea", 5));
	set.add(new Grocery(50, "Milk", 7));
	set.add(new Grocery(60, "Bread", 1));
	set.add(new Grocery(82, "Biscuits", 8));
	set.add(new Grocery(82, "Biscuits", 8));
	set.add(new Grocery(82, "Biscuits", 8));
	

	
	TreeSet<Grocery> set2 = new TreeSet<>(new comparater());
	set2.addAll(set);
	
	
	
	
	
	System.out.println("\n================BY COMPARABLE============\n");
	set.forEach(e -> System.out.println(e));
	
	
	System.out.println("\n\n\n================BY COMPARATOR============\n");
	set2.forEach(e -> System.out.println(e));
	
	
	
	
		
		
	}
	
}





















