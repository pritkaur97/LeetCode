

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums= {1,3,5,6};
		int target=5;
		
		searchInsert(nums,target);
	}
	private static void searchInsert(int[] nums, int target)
	{
		int i=0;
		for(i=0; i<nums.length;i++) {
			if(nums[i]>=target ) {
				System.out.println(i);
				break;
			}
			
		}
		
	//return i;
	
}
}