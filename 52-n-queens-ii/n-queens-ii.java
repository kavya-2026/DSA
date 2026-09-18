class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];

        solve(0, n, col, diag1, diag2);
        return count;
    }

    void solve(int row, int n, boolean[] col, boolean[] d1, boolean[] d2) {
        if (row == n) {
            count++;
            return;
        }

        for (int c = 0; c < n; c++) {
            int x = row - c + n - 1;
            int y = row + c;

            if (col[c] || d1[x] || d2[y])
                continue;

            col[c] = d1[x] = d2[y] = true;

            solve(row + 1, n, col, d1, d2);

            col[c] = d1[x] = d2[y] = false;
        }
    }
}