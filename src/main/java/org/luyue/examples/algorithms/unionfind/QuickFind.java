package org.luyue.examples.algorithms.unionfind;

/**
 * <pre>
 * initialize: O(n)
 * union: O(n) - for n nodes, can take O(n2) to union them all
 * find: O(1)
 * Union too expensive (N array accesses).
 * Trees are flat, but too expensive to keep them flat.
 * </pre>
 * 
 * @author jlu
 *
 */
public class QuickFind {

    private int[] ids;

    public QuickFind(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++)
            ids[i] = i;
    }

    public void union(int p, int q) {
        int pIndex = ids[p];
        int qIndex = ids[q];
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == pIndex) {
                ids[i] = qIndex;
            }
        }

    }

    public boolean connected(int p, int q) {
        return ids[p] == ids[q];
    }

    public int[] getIds() {
        return ids;
    }
}
