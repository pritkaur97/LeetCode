import java.util.Stack;

public class ReverseInt {

	public static void main(String[] args) {
		int x=1534236469;
		int reversed=0;
			while(x!=0) {
				int rem = x % 10;
				if(reversed>Integer.MAX_VALUE/10 ||reversed==Integer.MAX_VALUE/10  && rem>7) {
					System.out.println("0");
				}
				if(reversed<Integer.MIN_VALUE/10 ||reversed==Integer.MIN_VALUE/10&& rem< -8)
					System.out.println("0");
				reversed = reversed*10 + rem;
				x=x/10;
			}
			System.out.println(reversed);
	}
}
