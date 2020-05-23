import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		String string= input.nextLine();
//		int N= input.nextInt();
//		String[] array= new String[N];
//			for(int i=0; i<array.length; i++) {
//				array[i]=input.nextLine();
//			}
//			
			System.out.println(isValid(string));
		
	}
	private static boolean isValid(String string) {
		
		char[] array =string.toCharArray();
		Stack<Character> myStack= new Stack<>();
			for(int i=0; i<array.length; i++)
			{
				char ch = array[i];
				if(ch=='(' || ch=='{' || ch=='[') {
					myStack.push(ch);
				}
				if(ch==')') {
					Character top= myStack.pop();
						if(top!='(') {
							return false;
						}
				}
				if(ch =='}') {
					Character top=myStack.pop();
						if(top!='{') {
							return false;
						}
				}
				if(ch==']') {
					Character top=myStack.pop();
						if(top!='[') {
							return false;
						}
				}
				if(myStack.size()==0)
				{
					return true;
				}
			}
			
		return false;
		
	}

}
