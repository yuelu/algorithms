package com.luyue.examples.algorithms.sorting;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.luyue.examples.algorithms.sorting.MergeSort;

public class MergeSortTest {

    @Test
    public void testSort() {
        Integer[] aList = new Integer[] { 6, 11, 2, 1, 24, 100, 2, 50, 10 };
        Integer[] sortedArray = new Integer[] { 1, 2, 2, 6, 10, 11, 24, 50, 100 };
        MergeSort.sort(aList);
        assertThat(aList, is(sortedArray));
    }

}
