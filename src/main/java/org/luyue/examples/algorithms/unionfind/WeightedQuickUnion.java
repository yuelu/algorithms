package org.luyue.examples.algorithms.unionfind;

public class WeightedQuickUnion {

    private int[] ids;
    private int[] size;

    public WeightedQuickUnion(int n) {
        ids = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
            size[i] = 1;
        }
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
        if (pRoot == qRoot)
            return;
        else if (size[pRoot] < size[qRoot]) {
            ids[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        } else {
            ids[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }
    }

    public int[] getIds() {
        return ids;
    }
}
