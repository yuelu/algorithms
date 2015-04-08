package org.luyue.examples.algorithms.sorting;

public class SelectionSort {

    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] arr) {

        if (arr != null && arr.length > 1) {
            int length = arr.length;
            for (int i = 0; i < length; i++) {
                int min = findMinIndex(arr, i);
                if (min != i) {
                    swap(arr, i, min);
                }
            }
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static int findMinIndex(Comparable[] arr, int i) {
        int min = i;
        int length = arr.length;
        for (int j = i + 1; j < length; j++) {
            if (arr[min].compareTo(arr[j]) > 0) {
                min = j;
            }
        }
        return min;
    }

    @SuppressWarnings("rawtypes")
    private static void swap(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
