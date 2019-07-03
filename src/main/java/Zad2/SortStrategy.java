package Zad2;

import java.util.Arrays;
import java.util.Random;

public class SortStrategy {

    private CountingSort countingSort = new CountingSort();
    private BubbleSort bubbleSort = new BubbleSort();

    public void main(String[] args) {
        Integer[] values = {1,5,2,8,10,7,9,12};
        String sort = "bubble";
        sortStrategy(values, sort);
        Arrays.stream(values).forEachOrdered((value -> System.out.print(value + " ")));
    }


    public void sortStrategy(Integer[] values, String clientAnswear) {
        if (areOnlyPositiveNumbers(values)) {
            if (selectTypeOfSorting(clientAnswear).equals("bubble")) {
                bubbleSort.sort(values);
            } else {
                countingSort.sort(values);
            }
        } else {
            bubbleSort.sort(values);
        }
    }

    private boolean areOnlyPositiveNumbers(Integer[] input) {
        long negativeNumbers = Arrays.stream(input).filter(number -> number < 0).count();
        if (negativeNumbers == 0) {
            return true;
        }
        return false;
    }

    private String selectTypeOfSorting(String clientAnswear) {
        if (clientAnswear.equalsIgnoreCase("bubble")) {
            return "bubble";
        } else if (clientAnswear.equalsIgnoreCase("counting")) {
            return "counting";
        }
        Random random = new Random();
        int value = random.nextInt(1);
        if (value == 0) {
            return "bubble";
        } else {
            return "counting";
        }
    }
}
