package Zad2;

public class BubbleSort implements Sort{


    public Integer[] sort (Integer[] array) {
        for (int i = array.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1, array);
                }
            }
        }
        return array;
    }

    private void swap(int i, int j, Integer[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }




}
