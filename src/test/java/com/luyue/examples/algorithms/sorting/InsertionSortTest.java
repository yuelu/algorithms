package com.luyue.examples.algorithms.sorting;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.luyue.examples.algorithms.sorting.InsertionSort;

public class InsertionSortTest {

    @Test
    public void testNullArrary() {
        Integer[] aList = null;
        InsertionSort.sort(aList);
        assertThat(aList, is(nullValue()));
    }

    @Test
    public void testEmptyArrary() {
        Integer[] aList = new Integer[] {};
        InsertionSort.sort(aList);
        assertThat(aList, is(aList));
    }

    @Test
    public void testSort() {
        Integer[] aList = new Integer[] { 6, 11, 2, 1, 24, 100, 2, 50, 10 };
        Integer[] sortedArray = new Integer[] { 1, 2, 2, 6, 10, 11, 24, 50, 100 };
        InsertionSort.sort(aList);
        assertThat(aList, is(sortedArray));
    }
}
