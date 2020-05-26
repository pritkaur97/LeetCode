
public class LengthOfLastWord {

	public static void main(String[] args) {
		String s= "hello world ";
		
		System.out.println(find(s));
	}
	
	private static int find(String s) {
		
		
			String[] array= s.split(" ");
			
			return (array.length == 0) ? 0 : array[array.length - 1].length();
	}

}
