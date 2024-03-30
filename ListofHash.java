package Demo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ListofHash {
	


	    public static void main(String[] args) {
	        List<Map<String, Integer>> list = List.of(
	                new HashMap<>(Map.of("a", 1, "b", 2)),
	                new HashMap<>(Map.of("c", 3, "d", 4))
	        );

	        for (Map<String, Integer> map : list) {
	            for (Map.Entry<String, Integer> entry : map.entrySet()) {
	                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	            }
	        
	    }
	}


}
