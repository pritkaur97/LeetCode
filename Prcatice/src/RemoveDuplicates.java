import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] array= {1,1,2,2,3,3,4,4};
		
		int length= array.length;
		length=calculate(array,length);
		 for (int i=0; i<array.length; i++)  
	           System.out.print(array[i]+" ");  
			
	}
	private static int calculate(int[] array, int length) {
		int i=0; 
		int[] nums= new int[length];
		for(int j=0; j<length-1; j++) {
			
			if(array[j] != array[j+1]) {
				
				i++;
				
				array[i]=array[j];
				
			}
	}
		for (int j=0; j<i; j++){  
            array[j] = nums[j];  
        }  
		
		return i+1;
	}
	
		
}
