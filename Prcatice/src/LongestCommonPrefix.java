import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		String[] array= new String[x];
			for(int i=0; i<x; i++) {
				array[i]=input.next();
			}
		System.out.println(Arrays.toString(array));
	
		System.out.println(calculate(array));
	}
	private static String calculate(String[] array) {
		
		if(array==null || array.length==0)
		{
			return "";
		}
		for(int i=0; i<array[0].length(); i++)
		{
			char c= array[0].charAt(i);
			for(int j=1; j<array.length; j++)
			{
				if(i == array[j].length() || array[j].charAt(i) != c)
					return array[0].substring(0,i);
			}
		}
		return array[0];
		
		
	}
	
}
