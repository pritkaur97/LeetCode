import java.util.Scanner;

public class Console {
	private static Scanner input= new Scanner(System.in);
	//method overloading
	public static double readNumber(String prompt){
		return input.nextDouble();
		
	}
	public static double readNumber(String prompt, int min, int max){
		double value;
		while(true)
		{
			System.out.print(prompt);
			value= input.nextDouble();
		
			if((value >= min) && value <= max)
				break;
			System.out.println("Please enter valid value between " + min + "-" +max);
		
			}
			return value;
	}
}
