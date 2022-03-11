package week3.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "I am software engineer";
		
		String outputString = "";
		
		String[] splitWords = input.split(" ");
		
		System.out.println(Arrays.toString(splitWords));
		
		int splitArrayLength = splitWords.length;
		System.out.println("Array length:" + splitArrayLength);
		
		for (int i = 0; i < splitArrayLength; i++) {
			
			if ((i + 1) % 2 == 0) {
		
				char[] charArray = splitWords[i].toCharArray();
				
				String reverseWord = "";
				
				for (int j = charArray.length - 1; j >= 0; j--) {
					
					reverseWord = reverseWord + charArray[j];
					
				}
				outputString = outputString+reverseWord+" ";
				
			} else {
				outputString = outputString+splitWords[i]+" ";
			}
		}
		
		System.out.println(outputString);
	}}
		
		
		
				
				
		
	
		
		
			
				
				
				
		
		
		

	


