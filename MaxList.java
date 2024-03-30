package Demo;
import java.util.List;

public class MaxList {


	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(3, 9, 1, 4, 7, 6);
	        int max = Integer.MIN_VALUE;

	        for (int num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	        }

	        System.out.println("Maximum value: " + max);
	    
	}
}

