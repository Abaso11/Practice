import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		int []array = {3,4,5,8,9,1,3};
		int larg =0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>larg) {
				larg=array[i];
				
			}
			
		}
		System.out.println(larg);
		
	}

}
