package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss"; 
		int l1 = text1.length();
		int l2 = text2.length();
		if (l1==l2) {
			System.out.println("is equal");
			
		}
		else
		{
			System.out.println("is not equal");
		}
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
		boolean equals = Arrays.equals(ch1, ch2);
		System.out.println(equals);

	}

}
