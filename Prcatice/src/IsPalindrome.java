import java.util.Arrays;
import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int x= input.nextInt();
		System.out.println(isPalindrome(x));
	}
		
	public static boolean isPalindrome(int x) {
		     String sr= Integer.toString(x);
				int reversed =0;
				while(x!=0) {
					int rem = x % 10;
					reversed = reversed * 10 + rem;
					x= x/10;
				}
				String out= Integer.toString(reversed);
				if(!(sr.equals(out))||sr.startsWith("-")) {
					return false;
				}
				else {
					return true;
				}
		        
		    }
//		StringBuilder builder = new StringBuilder();
//		String reversedString = builder.append(orignalString).reverse().toString();
//		if(orignalString.equals(reversedString))
//			System.out.println("true");
//			else
//				System.out.println("false");
	

}
