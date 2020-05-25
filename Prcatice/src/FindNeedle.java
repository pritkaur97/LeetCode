
public class FindNeedle {

	public static void main(String[] args) {
		String haystack="hello";
        String needle="p";
        
        if(needle.length()==0) {
        	System.out.println(0);
        }

        	if(haystack.contains(needle)) {
        		System.out.println(haystack.indexOf(needle));
        	}
        	else {
        		System.out.println(-1);
        	
        	
        }
	}

}
