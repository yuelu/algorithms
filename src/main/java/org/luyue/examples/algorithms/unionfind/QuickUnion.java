package org.luyue.examples.algorithms.unionfind;

/**
 * <pre>
 * initialize: O(n)
 * union: O(n) - for n nodes, can take O(n2) to union them all
 * find: O(n)
 * Trees can get tall.
 * Find too expensive (could be N array accesses).
 * </pre>
 * 
 * @author jlu
 *
 */
public class QuickUnion {

    private int[] ids;

    public QuickUnion(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++)
            ids[i] = i;
    }

    public int root(int i) {
        while (i != ids[i]) {
            i = ids[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        ids[pRoot] = qRoot;
    }
}
