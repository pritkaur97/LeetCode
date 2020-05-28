import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {4,5,6};
		int m= nums1.length;
		int n= nums2.length;
		
		merge(nums1,nums2,m,n);
	}

	private static void merge(int[] nums1, int[] nums2, int m, int n) {
		System.arraycopy(nums2, 0, nums1, m-n, n);
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

}
