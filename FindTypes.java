package week3.day2;


public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
	
		
		
		char[] ch = test.toCharArray();
		int length = ch.length;
		for (int i= 0; i<=ch.length-1; i++) {
			
			if( Character.isLetter(ch[i])) {
				letter++;
			}else
			if (Character.isDigit(ch[i])) {
				num++;
			}else
			
			if (Character.isSpaceChar(ch[i])) {
				space++;
				
			}
			else
			{
				
				specialChar++;
			}
			
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		}
	}


