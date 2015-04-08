package org.luyue.examples.algorithms.sorting;

public class InsertionSort {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void sort(Comparable[] arr) {

        if (arr != null && arr.length > 1) {
            int length = arr.length;
            for (int i = 1; i < length; i++) {
                Comparable target = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (target.compareTo(arr[j]) < 0) {
                        swap(arr, j, j + 1);
                    }
                }
                print(arr);
            }
        }
    }

    @SuppressWarnings("rawtypes")
    private static void swap(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    @SuppressWarnings("rawtypes")
    private static void print(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
        System.out.println();
    }
}
