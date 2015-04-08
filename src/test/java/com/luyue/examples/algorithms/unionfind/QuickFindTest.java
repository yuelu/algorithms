package com.luyue.examples.algorithms.unionfind;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.luyue.examples.algorithms.unionfind.QuickFind;

public class QuickFindTest {

    @Test
    public void testConnected() {
        QuickFind qf = new QuickFind(10);
        qf.union(0, 5);
        qf.union(5, 6);
        qf.union(1, 6);
        qf.union(1, 2);
        qf.union(2, 7);
        qf.union(3, 4);
        qf.union(3, 8);
        qf.union(4, 9);

        assertTrue(qf.connected(0, 7));
        assertTrue(qf.connected(5, 7));
        assertTrue(qf.connected(2, 5));
        assertTrue(qf.connected(8, 9));
        assertTrue(qf.connected(3, 4));
        assertTrue(qf.connected(9, 3));
        assertFalse(qf.connected(0, 9));
    }

    @Test
    public void test1() {
        QuickFind qf = new QuickFind(10);
        qf.union(9, 3);
        printids(qf);
        qf.union(2, 0);
        printids(qf);
        qf.union(4, 7);
        printids(qf);
        qf.union(7, 8);
        printids(qf);
        qf.union(8, 2);
        printids(qf);
        qf.union(8, 1);
        printids(qf);
    }

    private void printids(QuickFind qf) {
        int[] ids = qf.getIds();
        for (int id : ids)
            System.out.print(id + " ");
        System.out.println();
    }

}
