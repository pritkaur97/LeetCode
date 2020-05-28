import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] array= {1,2,3};
		
		add(array);
	}
private static int[] add(int[] array)
{
	int n= array.length;
	int a=array[n-1]+1;
	n=n-1;
	int[] newArray= {a};
	int length= newArray.length;
	int[] result= new int[n+length];
	
	System.arraycopy(array, 0, result, 0, n);
    System.arraycopy(newArray, 0, result, n, length);
   
    System.out.println(Arrays.toString(result));
    
	return result;
	
	}

}
