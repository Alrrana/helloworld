package hw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.*;

public class ArraysTest {
    InputHelperStub inputHelper = new InputHelperStub();
    Arrays arrays = spy(new Arrays());


    @Before
    public void setExpected() {
        //Let all our random generated ints be 0
        when(arrays.oneRandomInt()).thenReturn(0);
    }


    @BeforeAll
    public static void setExpected3() {

    }


    @Test
    public void createStandart() {
        arrays.setInputHelper(inputHelper);
        String[] t ={"апвпвап","1ыфввыаы","2фыв","3","4","1g","5","4"};
        inputHelper.setIn(t);

        int[] actual1 = arrays.CreateStandart();

        int[] expected = {4, 5, 4};
        Assert.assertArrayEquals(actual1, expected);
    }


    @Test
    public void createVarTest2() {
        int[] actual1 = arrays.CreateVariable(3);

        int[] expected = {0, 0, 0};
        Assert.assertArrayEquals(actual1, expected);
    }

    @Test
    public void createVarTest3() {
        int[] actual1 = arrays.CreateVariable(2, 1, 2, 5);

        int[] expected = {1, 2};
        Assert.assertArrayEquals(actual1, expected);
    }

    @Test
    public void createVarTest4() {
        int[] actual1 = arrays.CreateVariable(4, 1, 2, 5);

        int[] expected = {1, 2, 5, 0};
        Assert.assertArrayEquals(actual1, expected);
    }

    @Test
    public void createVarTest5() {
        int[] actual1 = arrays.CreateVariable(4, 1, 2, 3, 4);

        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(actual1, expected);
    }

}