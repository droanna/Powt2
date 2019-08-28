import Zad2.SortStrategy;
import org.junit.Assert;
import org.junit.Test;

public class SortStrategyTest {



    @Test
    public void setSortStrategyIfBubbleTest(){
        Integer[] values = {1,5,2,8,10,7,9,12};
        SortStrategy sortStrategy = new SortStrategy();
        values = sortStrategy.setSort("bubble", values);
        Integer[] result = {1,2,5,7,8,9,10,12};
        Assert.assertArrayEquals(result, values);
    }

    @Test
    public void setSortStrategyIfCountTest(){
        Integer[] values = {1,5,2,8,10,7,9,12};
        SortStrategy sortStrategy = new SortStrategy();
        values = sortStrategy.setSort("counting", values);
        Integer[] result = {1,2,5,7,8,9,10,12};
        Assert.assertArrayEquals(result, values);

    }
}
