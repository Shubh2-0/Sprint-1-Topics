package com.masai;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class GroceryItems{
	
private double price;
private String name;
private double usedFrequency;
public GroceryItems(double price, String name, double usedFrequency) {
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
	GroceryItems other = (GroceryItems) obj;
	return Objects.equals(name, other.name) && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
			&& Double.doubleToLongBits(usedFrequency) == Double.doubleToLongBits(other.usedFrequency);
}
@Override
public String toString() {
	return "Price=" + price + "\tName=" + name + "\tUsedFrequency=" + usedFrequency + "\n";
}


	
	
}



public class Main {


public static void main(String[] args) {
	
	
	TreeSet<GroceryItems> set1 = new TreeSet<>(new Comparetheitems());
	set1.add(new GroceryItems(240.6, "Paste", 4.5));
	set1.add(new GroceryItems(50.6, "Sugar", 10.5));
	set1.add(new GroceryItems(51.6, "Sugar", 10.5));
	set1.add(new GroceryItems(140.6, "Oil", 14.5));
	set1.add(new GroceryItems(340.6, "Oats", 24.5));
	set1.add(new GroceryItems(240.6, "Paste", 4.5));
	set1.add(new GroceryItems(240.6, "Ataa", 4.5));
	

	System.out.println(set1);
	
	
	
	TreeSet<GroceryItems> set2 = new TreeSet<>(new Comparetor2());
	
	set1.forEach(e->set2.add(e));
	
	System.out.println(set2);
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
