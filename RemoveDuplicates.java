package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;







public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		
		List<String>lst=new ArrayList<String>();
	

		
		String[] split = text.split(" ");
		System.out.println(Arrays.toString(split));
		
		int length = split.length;
		
		System.out.println(length);
		
		
		

			String str1="";
	
				
			
			for (String str : split) {
				for (int i = 0; i < split.length; i++) {
					
				
		  if (!lst.contains(str)) {
				
				
				lst.add(str);
				str1=str1+" "+str;
				count++;
			
			}else
			if(count>1) {
				
				String replace="";
				
			    
			}
		  }}
			
			System.out.println(str1);
			
			
		
	}}

		
		
		

			
			
			
			
	


		
		
				
		

	


