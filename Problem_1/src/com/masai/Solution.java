package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



/*   
 * Functional Programming is a kind of programming paradigm in which 
 * we divided the task into small small parts and that parts 
 * are done by the functions.
 * Basically in functional programming we are focusing on 
 * to doing the thing with functions.
 * 
 * 
 * Functional Interface is a kind of Interface that contain
 * only one abstract method. but a functional interface 
 * contain any number of private, static or default method.
 * for providing the implementation of abstract method 
 * of functional interface we use LAMBDA EXPRESSION , METHOD REFERENCES
 * and ANONYMOUS INNER CLASS.
 * 
 * 
 * 
 
 */



class Product{
	
 private int id;
 private String name;
 private double price;
 private int quantity;
 
 
 
public Product() {
	super();
}


public Product(int id, String name, double price, int quantity) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


@Override
public String toString() {
	return "ID : " + id + "      Name : " + name + "      Price : " + price + "      Quantity : " + quantity;
}
 
 
 
	
	
	
	
}



public class Solution {
	
	public static void main(String[] args) {
		
		
    List<Product> list = new ArrayList<>();
    
    list.add(new Product(2, "Pencil", 25.67, 20));
    list.add(new Product(3, "Chair", 1000, 3));
    list.add(new Product(4, "Table", 1560, 2));
    list.add(new Product(5, "Stady-lamp", 1200, 2));
    list.add(new Product(6, "Rubber", 5, 50));
    list.add(new Product(7, "Copy", 40.60, 10));
    list.add(new Product(8, "Register", 500, 2));
    
    
    Predicate<Product> checkQuantity = e -> e.getQuantity()<5;
    
    System.out.println("\n========================IMPLEMENTATION OF PREDICATE========================\n");
    
    list.forEach( e -> 
           System.out.println("Product Quantity is less than 5 ? "
           +checkQuantity.test(e)+
           "   Product Name : "+e.getName() +"   Quantity : "+e.getQuantity()));
   
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    System.out.println("\n\n\n========================IMPLEMENTATION OF CONSUMER========================\n");
    Consumer<Product> printDetails = e ->{
    	System.out.println("ID : "+e.getId()+
    			           "\nName : "+e.getName()+
    			           "\nQuantity : "+e.getQuantity()+
    			           "\nPrice : "+e.getPrice()+
    			           "\n****************************************\n"
    			           );
    };
    
    System.out.println("PRINT THE DEATILS OF EACH PRODUCT IN NEW LINE");
    
    list.forEach(e -> printDetails.accept(e));
    
    

    Consumer<Product> printDetails2 = Product::toString;
    
    
    
    
    
    
    System.out.println("\n\n\n========================IMPLEMENTATION OF SUPPLIER========================\n"); 
    Supplier<Product> createProduct = () -> new Product(9, "Computer", 50000, 1);
    
    System.out.println("ADD A NEW PRODUCT INTO LIST WHICH HAVE COMMON USE");
    list.add(createProduct.get());
    
    list.forEach(e -> System.out.println(e));
    
    
    
    
    
    System.out.println("\n\n\n========================IMPLEMENTATION OF FUNCTION FUNCTIONAL========================\n");
    Function<String, Product> changeIntoProduct = s -> {
    String[] ar = s.split(",");
    int id = Integer.parseInt(ar[0]);
    String name = ar[1];
    double price = Double.parseDouble(ar[2]);
    int quan = Integer.parseInt(ar[3]);
    return new Product(id, name, price, quan);
    };
    
    
    System.out.println("ADDING NEW PRODUCT INTO LIST AND THAT PRODUCTS ARE :");
    String p1 = "1,Pen,20.00,100";
    String p2 = "10,Desk,4000,4";
    String p3 = "11,PenDrive,1000,1";
    String p4 = "12,Mouse,850,1";
    
    list.add(changeIntoProduct.apply(p1));
    list.add(changeIntoProduct.apply(p2));
    list.add(changeIntoProduct.apply(p3));
    list.add(changeIntoProduct.apply(p4));
    
    
    
    list.forEach(e -> System.out.println(e));
    
    
    
    
    
    
    
		
		
		
		
	}
	

}





























