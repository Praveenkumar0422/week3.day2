package week3.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length = arr.length;
		System.out.println("length of the array is:" + length);
		
		int count;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			count=0;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if (arr[i]==arr[j]) {
					
					count=count+1;
				}
			}
			if(count>0) {
				System.out.println(arr[i]);
			}
				
				
					
			
		
		}
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
		
	
		
		