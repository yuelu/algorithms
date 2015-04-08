package org.luyue.examples.algorithms.sorting;

public class Sorting {

    public static void main(String[] args) {
        int[] aList = new int[] { 6, 11, 2, 1, 24, 100, 2, 50, 10 };

        int len = aList.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (aList[min] > aList[j]) {
                    min = j;
                }
            }

            int tmp = aList[i];
            aList[i] = aList[min];
            aList[min] = tmp;
        }

        for (int i = 0; i < len; i++)
            System.out.println(aList[i]);
    }

}
