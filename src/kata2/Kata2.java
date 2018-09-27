package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 
            4, 4, 5, 5, 5, 6, 6, 6};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i : array) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
}
