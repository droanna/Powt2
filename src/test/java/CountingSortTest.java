import Zad2.CountingSort;
import org.junit.Assert;
import org.junit.Test;

public class CountingSortTest {

    @Test
    public void sortTest(){
        CountingSort countingSort = new CountingSort();
        Integer[] list  = {1,5,2,8,10,7,9,12};
        list = countingSort.sort(list);
        Integer[] result = {1,2,5,7,8,9,10,12};
        Assert.assertArrayEquals(list, result);
    }
}
