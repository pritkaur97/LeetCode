import java.util.LinkedList;

public class ListNode {
	
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		     }
		      
		      public static void main(String[] args)
		      {
		    	 int pos=1;
		    	 LinkedList<Integer> myList=new LinkedList<>();
		    	myList.add(1);
		    	myList.add(2);
		    	myList.add(0);
		    	myList.add(-4);
		    	 System.out.println(hasCycle(myList,pos));
		      }

			private static boolean hasCycle(LinkedList<Integer> myList, int pos) {
				if(pos<myList.size() && pos>=0) {
					return true;
				}
				
				return false;
				
			}
}
