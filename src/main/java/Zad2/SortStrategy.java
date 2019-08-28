package Zad2;

import java.util.Arrays;
import java.util.Random;

public class SortStrategy {

    private Sort sort;
    private String clientAnswear;
    private Integer[] values;



    public Integer[] setSort(String clientAnswear, Integer[] values) {
        if (areOnlyPositiveNumbers(values)) {
            if (selectTypeOfSorting(clientAnswear).equals("bubble")) {
                sort = new BubbleSort();
                values = sort.sort(values);
                return values;
            } else {
                sort = new CountingSort();
                values = sort.sort(values);
                return values;
            }
        } else {
            sort = new BubbleSort();
            values = sort.sort(values);
            return values;
        }
    }

    private boolean areOnlyPositiveNumbers(Integer[] input) {
        long negativeNumbers = Arrays.stream(input).filter(number -> number < 0).count();
        return (negativeNumbers == 0);
    }

    private String selectTypeOfSorting(String clientAnswear) {
        if (clientAnswear.equalsIgnoreCase("bubble")) {
            return "bubble";
        } else if (clientAnswear.equalsIgnoreCase("counting")) {
            return "counting";
        }
        Random random = new Random();
        int value = random.nextInt(2);
        if (value == 0) {
            return "bubble";
        } else {
            return "counting";
        }
    }
}
