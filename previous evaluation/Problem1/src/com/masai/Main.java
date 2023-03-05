package com.masai;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* What do you mean by Functional programming 
and Functional interface?
Functional programming are that type of programming in
which we create and refers methods which is very useful
to decrease our code length and also we can fix bug and we 
can optimize our code in more precise way.

Functional interface:-
Functional interface are those kind of interfaces which have one 
abstract method only but any number of final variables,
private methods , default method or static method.
  

*/

class Product{

private int productId;
private String name;
private int quantity;
private double price;

public Product(int quantity, int productId, double price, String name) {
	super();
	this.quantity = quantity;
	this.productId = productId;
	this.price = price;
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
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
@Override
public String toString() {
	return "Product [quantity=" + quantity + ", productId=" + productId + ", price=" + price + ", name=" + name + "]";
}
	



}


public class Main {
	
public static void main(String[] args) {	
ArrayList<Product> list = new ArrayList<>();

Predicate<Product> checking = e -> e.getQuantity() < 5;

Consumer<Product> print = e -> System.out.println(e);

Supplier<Product> getProduct = () -> new Product(5, 27, 45.6, "Pencil");

Function<String, Product> give = r -> {
String[] arr = r.split(",");
int id = Integer.parseInt(arr[0]);
String s = arr[1];
double d = Double.parseDouble(arr[2]);
int q = Integer.parseInt(arr[3]);

Product product = new Product(q, id, d, s);

return product;
};




Product p1 = new Product(3, 5, 50.66, "Calculator");
print.accept(p1);

System.out.println(getProduct.get());

System.out.println(checking.test(p1));


System.out.println(give.apply("1,Pen,20.00,100"));
	
	
	
}	
	
	
	
	
	
	
	
}
