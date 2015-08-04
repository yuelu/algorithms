package org.luyue.examples.algorithms.sorting;

/**
 * <pre>
 * level: log2N +1 
 * at each level j=0,1,2,...,log2N, there are 2^j subproblems, each of size n/2^j
 * total # of operations at level j <= 2^j * 6(n/2^j)=6n (independent of j) 
 * total operations: <= 6n*(log2N + 1)
 * </pre>
 * 
 * @author jlu
 *
 */
public class MergeSort {

    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] arr) {
        assert arr != null;
        assert arr.length > 0;

        Comparable[] aux = new Comparable[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void sort(Comparable[] arr, Comparable[] aux, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        sort(arr, aux, low, mid);
        sort(arr, aux, mid + 1, high);
        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            merge(arr, aux, low, mid, high);
        }

        print(arr);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high) {
        for (int k = low; k <= high; k++)
            aux[k] = arr[k];

        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > high) {
                arr[k] = aux[i++];
            } else if (aux[i].compareTo(aux[j]) < 0) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }

    @SuppressWarnings("rawtypes")
    private static void print(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
        System.out.println();
    }

}
