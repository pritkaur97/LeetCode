import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums= {4,4,2,1,2};
		
		System.out.println(find(nums));
	}

	private static int find(int[] nums) {
		HashMap<Integer,Integer> hash= new HashMap<>();
		for(int i : nums)
		{
			hash.put(i,hash.getOrDefault(i,0)+1);
		}
		for(int i :nums)
		{
			if(hash.get(i)==1)
			{
				return i;
			}
		}
		return 0;
		
	}

}
