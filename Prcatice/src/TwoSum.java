import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class TwoSum { 
	public static int[] calculate(int[] array, int target) {
		int[] result = new int[2];
		HashMap<Integer,List<Integer>> myHash= new HashMap<>();
		fillHashMap(myHash,array);
		
		for(int i=0; i<array.length; i++) {
			int num= target-array[i];
			
			if(myHash.containsKey(num)) {
				if(num == array[i] && myHash.get(num).size() !=1) {
					result[0] = i;
					result[1] = myHash.get(num).get(1);
					return result;
				} else {
					result[0] = i;
					result[1] = myHash.get(num).get(0);
					return result;
				}				
			}
		}
	
		return result;
	}
	
	public static void fillHashMap(HashMap<Integer,List<Integer>> myHash,int[] array) {
		for(int i=0;i<array.length;i++) {
			List<Integer> myList;
			if(myHash.containsKey(array[i])) {
				myList = myHash.get(array[i]);
				myList.add(i);
			}else {
				myList = new ArrayList<>();
				myList.add(i);
				myHash.put(array[i],myList);
			}
			
		}
		System.out.println(myHash);
	}
	public static void main(String[] args) {
        int[] array = new int[] {2,7,11,15,2};
        int target=4;
        int[] ar = calculate(array, target);
		System.out.println(ar[0] +" "+ ar[1]);
          }
	}


