package com.masai;

import java.util.Comparator;

public class Comparetheitems implements Comparator<GroceryItems> {




	@Override
	public int compare(GroceryItems o1, GroceryItems o2) {
	
		int ans = (int) (o2.getUsedFrequency() - o1.getUsedFrequency());
		
		if(ans!=0) {
			return ans;
		}
	
		int ans2 = (int) (o2.getPrice() - o1.getPrice());
		
		if(ans2!=0) {
			return ans2;
		}
		
		return o2.getName().compareTo(o1.getName());
		

	}
	
	
}
