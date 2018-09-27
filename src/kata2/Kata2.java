package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 
            4, 4, 5, 5, 5, 6, 6, 6};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            if (histogram.containsKey(array[i])) {
                histogram.put(array[i], histogram.get(array[i])+1); 
            } else {
                histogram.put(array[i], 1);
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
}
