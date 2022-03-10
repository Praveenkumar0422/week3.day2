package week3.day2;

import net.bytebuddy.implementation.bytecode.collection.ArrayLength;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char search='e';
		int count = 0;
		char[] ch = str.toCharArray();
		System.out.println("length of array "+ ch.length);
	 for (int i = 0; i <= ch.length-1; i++) 
		
	
		{
			if(ch[i]==search)
				
				
			count++;
			
		
			
				
		}
	 System.out.println("the character "+search+" apperas "+count+" times");	
	
	
		
			
			}
}
		
			
					
			
			
		

		
		

	


