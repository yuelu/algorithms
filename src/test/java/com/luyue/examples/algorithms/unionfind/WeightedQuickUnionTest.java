package com.luyue.examples.algorithms.unionfind;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.luyue.examples.algorithms.unionfind.WeightedQuickUnion;

public class WeightedQuickUnionTest {

    @Test
    public void testConnected() {
        WeightedQuickUnion wqu = new WeightedQuickUnion(10);
        wqu.union(0, 5);
        wqu.union(5, 6);
        wqu.union(1, 6);
        wqu.union(1, 2);
        wqu.union(2, 7);
        wqu.union(3, 4);
        wqu.union(3, 8);
        wqu.union(4, 9);

        assertTrue(wqu.connected(0, 7));
        assertTrue(wqu.connected(5, 7));
        assertTrue(wqu.connected(2, 5));
        assertTrue(wqu.connected(8, 9));
        assertTrue(wqu.connected(3, 4));
        assertTrue(wqu.connected(9, 3));
        assertFalse(wqu.connected(0, 9));
    }

    @Test
    public void test1() {
        WeightedQuickUnion wqu = new WeightedQuickUnion(10);
        wqu.union(8, 0);
        printIds(wqu);
        wqu.union(5, 0);
        printIds(wqu);
        wqu.union(6, 1);
        printIds(wqu);
        wqu.union(2, 3);
        printIds(wqu);
        wqu.union(4, 7);
        printIds(wqu);
        wqu.union(7, 3);
        printIds(wqu);
        wqu.union(1, 5);
        printIds(wqu);
        wqu.union(7, 8);
        printIds(wqu);
        wqu.union(6, 9);
        printIds(wqu);

    }

    private void printIds(WeightedQuickUnion wqu) {
        int[] ids = wqu.getIds();
        for (int id : ids)
            System.out.print(id + " ");
        System.out.println();
    }

}
