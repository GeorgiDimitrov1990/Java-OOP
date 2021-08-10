package p04_BubbleSortTest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BubbleTest extends TestCase {

    @Test
    public void testSort() {
        int[] arr = {100, 13, 7, 0, -5, 2};
        Bubble.sort(arr);
        int[] sortedArr = {-5, 0, 2, 7, 13, 100};

        for (int i = 0; i < sortedArr.length; i++) {
            Assert.assertEquals(sortedArr[i], arr[i]);
        }
    }
}