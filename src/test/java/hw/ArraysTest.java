package hw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArraysTest {



    @Test
    public void createStandart() {
        InputHelper inputHelper = new InputHelperStub();
        Arrays arrays =new Arrays();
        arrays.setInputHelper(inputHelper);

        int[] actual1 = arrays.CreateStandart();

        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(actual1, expected);
    }

    @Test
    public void createStandart1() {
    }
}