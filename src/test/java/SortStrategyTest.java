import Zad2.SortStrategy;
import org.junit.Assert;
import org.junit.Test;

public class SortStrategyTest {

    SortStrategy sortStrategy = new SortStrategy();

    @Test
    public void setSortStrategyIfBubbleTest(){
        Integer[] values = {1,5,2,8,10,7,9,12};
        String sort = "bubble";
        sortStrategy.sortStrategy(values, sort);
        Integer[] result = {1,2,5,7,8,9,10,12};
        Assert.assertArrayEquals(result, values);
    }

    @Test
    public void setSortStrategyIfCountTest(){
        Integer[] values = {1,5,2,8,10,7,9,12};
        String sort = "sort";
        sortStrategy.sortStrategy(values, sort);
        Integer[] result = {1,2,5,7,8,9,10,12};
        Assert.assertArrayEquals(result, values);

    }
}
