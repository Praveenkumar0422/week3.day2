package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]a={3,2,11,4,6,7};
		Integer[]b={1,2,8,4,9,7};
		List<Integer>lst1=Arrays.asList(a);
		List<Integer>lst2=Arrays.asList(b);
		
		int size = lst1.size();
		int size2 = lst2.size();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size2; j++) {
				if (a[i]==b[j]) {
					System.out.println("intersection is:"+a[i]);
					
				}
				
			}
			
		}
		
	
			
		}
}
		
		
			

		
	
		
	


	
	
	
		
		
		
		
		
		
		
		
				
				
	
		
	
		
		
		
		


	

