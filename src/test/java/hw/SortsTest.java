package hw;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.*;

public class SortsTest {
    int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Sorts sorts = new Sorts();



  @BeforeAll
  public void SetExpected(){

  }



    @Test
    public void quickSortNoSortRequired() {

        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        sorts.QuickSort(actual);

        Assert.assertArrayEquals(actual, expected);

    }

    @Test
    public void quickSortReversedArray() {
        Arrays arrays = mock(Arrays.class);
      int[] t ={9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        when(arrays.CreateStandart()).thenReturn(t);
        int[ ] actual1 = arrays.CreateStandart();

        sorts.QuickSort(actual1);

        Assert.assertArrayEquals(actual1, expected);
    }


    @Test
    public void quickSortRandomArray() {
        int[] actual1 = {9, 8, 5, 6, 7, 4, 2, 3, 0, 1};

        sorts.QuickSort(actual1);

        Assert.assertArrayEquals(actual1, expected);
    }


    @Test
    public void mergeNoSortRequired() {

        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        sorts.Merge(actual);

        Assert.assertArrayEquals(actual, expected);

    }

    @Test
    public void mergeReversedArray() {

        int[] actual1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        sorts.Merge(actual1);

        Assert.assertArrayEquals(actual1, expected);


    }

    @Test
    public void mergeRandomArray() {
        int[] actual1 = {9, 8, 5, 6, 7, 4, 2, 3, 0, 1};

        sorts.Merge(actual1);

        Assert.assertArrayEquals(actual1, expected);
    }


    @Test
    public void insertionClassicNoSortRequired() {

        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        sorts.InsertionSortClassic(actual);

        Assert.assertArrayEquals(actual, expected);

    }

    @Test
    public void insertionClassicReversedArray() {

        int[] actual1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        sorts.InsertionSortClassic(actual1);

        Assert.assertArrayEquals(actual1, expected);


    }

    @Test
    public void insertionClassicRandomArray() {
        int[] actual1 = {9, 8, 5, 6, 7, 4, 2, 3, 0, 1};

        sorts.InsertionSortClassic(actual1);

        Assert.assertArrayEquals(actual1, expected);
    }


    @Test
    public void insertionModifiedNoSortRequired() {

        int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expected);

    }

    @Test
    public void insertionModifiedReversedArray() {

        int[] actual1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        sorts.InsertionSortModified(actual1);

        Assert.assertArrayEquals(actual1, expected);


    }

    @Test
    public void insertionModifiedRandomArray() {
        int[] actual1 ={6, 8, 5, 9, 7, 4, 2, 3, 0, 1};

        sorts.InsertionSortModified(actual1);

        Assert.assertArrayEquals(actual1, expected);

    }

    @Test
    public void insertionModifiedRandomArray1() {
        int[] actual1 = {9, 8, 5, 6, 7, 4, 2, 3, 0, 1};

        sorts.InsertionSortModified(actual1);

        Assert.assertArrayEquals(actual1, expected);

    }
    Arrays arrays =new Arrays();

    @Test
    public void RandomTestForInsertionModified1() {

        int[] actual = arrays.rndWithLength(100);
        int[] expect = actual;
        sorts.QuickSort(expect);

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expect);

    }

    @Test
    public void RandomTestForInsertionModified2() {

        int[] actual = arrays.rndWithLength(100);
        int[] expect = actual;
        sorts.QuickSort(expect);

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expect);

    }
    @Test
    public void RandomTestForInsertionModified3() {

        int[] actual = arrays.rndWithLength(100);
        int[] expect = actual;
        sorts.QuickSort(expect);

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expect);

    }
    @Test
    public void RandomTestForInsertionModified4() {

        int[] actual = arrays.rndWithLength(100);
        int[] expect = actual;
        sorts.QuickSort(expect);

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expect);

    }
    @Test
    public void RandomTestForInsertionModified5() {

        int[] actual = arrays.rndWithLength(100);
        int[] expect = actual;
        sorts.QuickSort(expect);

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expect);

    }
    @Test
    public void RandomTestForInsertionModified6() {

        int[] actual = arrays.rndWithLength(100);
        int[] expect = actual;
        sorts.QuickSort(expect);

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expect);

    }
    @Test
    public void RandomTestForInsertionModified7() {

        int[] actual = arrays.rndWithLength(100);
        int[] expect = actual;
        sorts.QuickSort(expect);

        sorts.InsertionSortModified(actual);

        Assert.assertArrayEquals(actual, expect);

    }

}


