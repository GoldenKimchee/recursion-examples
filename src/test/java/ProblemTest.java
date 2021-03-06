import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemTest {
    @Test
    public void Sum() {

        int testSize = 100;
        int data[] = new int[testSize];
        for (int i=0; i<testSize; i++) {
            data[i] = i*10;
        }

        int iterativeSum = Sum.iterativeSum(data);
        int coolSum = Sum.coolSum(data);
        int recursiveSum = Sum.recursiveSum(data);

        assertEquals(iterativeSum, recursiveSum);
        assertEquals(iterativeSum, coolSum);
    }

    @Test
    public void haveADream() {
        Dream.dream(2);
    }

    @Test
    public void uniquePaths() {
        int inputs[][] = {
                {0,0},
                {0,1},
                {1,0},
                {1,1},
                {1,2},
                {2,1},
                {2,2},
                {2,4},
                {3,5},
                //{10,20},
        };
        int expected[] = {0, 0, 0, 1, 1, 1, 2, 4, 15};

        assertEquals(inputs.length, expected.length);

        boolean failed = false;
        for (int i=0; i<inputs.length; i++) {
            int actual = UniquePath.uniquePaths(inputs[i][0], inputs[i][1]);
            assertEquals(expected[i], actual);
        }
    }

    @Test
    public void findMax() {
        int[][] data = {
                {3},
                {3, 4, 6},
                {3, 4, 6, -1},
                {3, 4, 6, -1, 9, 20},
        };
        int[] expect = {3, 6, 6, 20};
        for (int i = 0; i < data.length; i++) {
            int actualIter = Max.findMaxIterative(data[i]);
            int actualRecr = Max.findMaxRecursive(data[i]);
            int actualStack = Max.findMaxUsingStack(data[i]);

            assertEquals(actualIter, expect[i]);
            assertEquals(actualRecr, expect[i]);
            assertEquals(actualStack, expect[i]);
        }
    }
}
