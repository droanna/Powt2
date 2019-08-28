package Zad2;

import java.util.Arrays;

public class Client {



    public static void main(String[] args) {


        Integer[] list = {1, 5, 2, 8, 10, 7, 9, 12};
        SortStrategy sortStrategy = new SortStrategy();
        list = sortStrategy.setSort("", list);
        System.out.println(Arrays.asList(list));


    }

}
