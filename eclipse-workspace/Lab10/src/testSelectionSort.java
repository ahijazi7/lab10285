import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class testSelectionSort {
    @Test
    public void testPositives() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {5, 9, 3, 1, 2};
        int[] expected = {1, 2, 3, 5, 9};
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNegatives() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {-3, -1, -7, -4, -5};
        int[] expected = {-7, -5, -4, -3, -1};
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMixed() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {0, -1, 5, -3, 2};
        int[] expected = {-3, -1, 0, 2, 5};
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDuplicates() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {2, -1, 2, -1, 0};
        int[] expected = {-1, -1, 0, 2, 2};
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }
}
