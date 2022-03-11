package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = {3,2,11,4,6,7};
		List<Integer>lst=Arrays.asList(data);
		Collections.sort(lst);
		System.out.println("List in ascending order "+lst);
	
		System.out.println("2nd element from the last "+ lst.get(lst.size()-2));
		

	
	

	
	

		
		

	}

}
