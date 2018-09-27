package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6};
        
        Histogram histo = new Histogram(array);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer,Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
