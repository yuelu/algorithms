package com.luyue.examples.algorithms.unionfind;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.luyue.examples.algorithms.unionfind.QuickUnion;

public class QuickUnionTest {

    @Test
    public void testConnected() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(0, 5);
        qu.union(5, 6);
        qu.union(1, 6);
        qu.union(1, 2);
        qu.union(2, 7);
        qu.union(3, 4);
        qu.union(3, 8);
        qu.union(4, 9);

        assertTrue(qu.connected(0, 7));
        assertTrue(qu.connected(5, 7));
        assertTrue(qu.connected(2, 5));
        assertTrue(qu.connected(8, 9));
        assertTrue(qu.connected(3, 4));
        assertTrue(qu.connected(9, 3));
        assertFalse(qu.connected(0, 9));
    }

}
