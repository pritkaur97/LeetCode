import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] array={3,2,3,2,4};
		int val =3;
		int i=0;
		int length=array.length;
		while(i<length)
		{
				if(array[i] == val) {
					int temp= array[i];
					array[i]=array[length-1];
					array[length-1]=temp;
					length--;
					
					
			}else
			{
				i++;
			}
				
			
		}
		System.out.println(length);
		System.out.println(Arrays.toString(array));
	}
}
