package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] array;

    public Histogram(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }
    
    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i : array) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        return histogram;
    }
}
