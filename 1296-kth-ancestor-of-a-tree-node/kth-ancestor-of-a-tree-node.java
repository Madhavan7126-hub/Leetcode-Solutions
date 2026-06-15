class TreeAncestor {

    private int[][] up;
    private int LOG;

    public TreeAncestor(int n, int[] parent) {

        LOG = 16;

        while ((1 << LOG) <= n) {
            LOG++;
        }

        up = new int[n][LOG];

        // 2^0 ancestor
        for (int i = 0; i < n; i++) {
            up[i][0] = parent[i];
        }

        // build binary lifting table
        for (int j = 1; j < LOG; j++) {

            for (int i = 0; i < n; i++) {

                int ancestor = up[i][j - 1];

                if (ancestor == -1) {
                    up[i][j] = -1;
                } else {
                    up[i][j] = up[ancestor][j - 1];
                }
            }
        }
    }

    public int getKthAncestor(int node, int k) {

        for (int j = 0; j < LOG; j++) {

            if ((k & (1 << j)) != 0) {

                node = up[node][j];

                if (node == -1) {
                    return -1;
                }
            }
        }

        return node;
    }
}