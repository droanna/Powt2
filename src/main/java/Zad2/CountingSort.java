package Zad2;

import java.util.Map;
import java.util.TreeMap;

public class CountingSort implements Sort {

    public Integer[] sort(Integer[] values) {

        Map<Integer, Integer> sort = new TreeMap<>();

        for (int j = 0; j < values.length; j++) {
            int value = values[j];
            Integer currentSum = sort.get(value);
            sort.put(value, currentSum != null ? ++currentSum : 1);
        }

        Map<Integer, Integer> summ = new TreeMap<>();
        int sum1 = 0;
        for (Map.Entry<Integer, Integer> entry : sort.entrySet()) {
            sum1 = sum1 + entry.getValue();
            summ.put(entry.getKey(), sum1);
        }

        Integer[] result = new Integer[values.length];
        for (int i = values.length - 1; i >= 0; i--) {
            int value = summ.get(values[i]);
            result[value - 1] = values[i];
            summ.put(values[i], value - 1);
        }
        values = result;
        return values;
    }
}
