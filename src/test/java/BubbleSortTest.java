import Zad2.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortTest(){
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] list  = {1,5,2,8,10,7,9,12};
        list = bubbleSort.sort(list);
        Integer[] result = {1,2,5,7,8,9,10,12};
        Assert.assertArrayEquals(list, result);
    }
}
