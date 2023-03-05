package com.masai;

import java.util.Comparator;

public class Comparetor2 implements Comparator<GroceryItems> {

	@Override
	public int compare(GroceryItems o1, GroceryItems o2) {
		

		int ans = (int) (o1.getUsedFrequency() - o2.getUsedFrequency());
		
		if(ans!=0) {
			return ans;
		}
	
		int ans2 = (int) (o1.getPrice() - o2.getPrice());
		
		if(ans2!=0) {
			return ans2;
		}
		
		return o1.getName().compareTo(o2.getName());	
		
	}


	
//	@Override
//	public int compare(GroceryItems o1, GroceryItems o2) {
//	
//		
//
//	}
//	

}
