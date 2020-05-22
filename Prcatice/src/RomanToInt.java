import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {
		String input= "VI";
		HashMap<Character,Integer> myHash= new HashMap<>();
		fillHashMap(myHash,input);
		calculate(myHash,input);
	}


	private static void fillHashMap(HashMap<Character,Integer> myHash, String input) {
		
		myHash.put('I', 1);
		myHash.put('V', 5);
		myHash.put('X', 10);
		myHash.put('L', 50);
		myHash.put('C', 100);
		myHash.put('D', 500);
		myHash.put('M', 1000);
		
		System.out.println(myHash);
		
	}

	private static void calculate(HashMap<Character,Integer> myHash, String input) {
		
		int start=0;
		int end= input.length();
				
		if(input.length()==1) {
			System.out.println(myHash.get(input.charAt(0)));
		}
		else
		{
			
		}		
	}
}
