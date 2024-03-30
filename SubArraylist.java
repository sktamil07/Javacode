package Demo;

import java.util.Collections;
import java.util.List;

public class SubArraylist {

	    public static void main(String[] args) {
	        List<Integer> mainList = List.of(1, 2, 3, 4, 5);
	        List<Integer> subLis= List.of(3, 4);

	        boolean containsSubList = Collections.indexOfSubList(mainList, subLis) != -1;
	        System.out.println(containsSubList);
	    

	}

}
