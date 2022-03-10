package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String str="madam";
		 String rev = "";
		 int strLength = str.length();
		 for (int i = (strLength-1); i >= 0; i--) {
			 rev = rev + str.charAt(i);
		 }
			 if (str.equalsIgnoreCase(rev)){
				 
				 System.out.println(str + " is a palindrome");
			 }
			 else {
		
				 System.out.println(str + " is not a palindrome");
				 
				
			}
			 
			 
			 
			
		}
			 
			 
		 
		 
	 
	
		
		

	}


