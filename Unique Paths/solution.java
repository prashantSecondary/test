1class Solution {
2    public static int getAllUniquePaths(int x, int y, int m, int n, int[][] dp) {
3        if (x == n - 1 && y == m - 1) {
4            return 1;
5        }
6        if (x == n || y == m) {
7            return 0;
8        }
9        if (dp[x][y] != -1) {
10            return dp[x][y];
11        }
12        dp[x][y] = getAllUniquePaths(x + 1, y, m, n, dp) + getAllUniquePaths(x, y + 1, m, n, dp);//right + down
13        return dp[x][y];
14    }
15
16    public int uniquePaths(int m, int n) {
17        int[][] dp = new int[n][m];
18        for (int i = 0; i < n; i++) {
19            for (int j = 0; j < m; j++) {
20                dp[i][j] = -1;
21            }
22        }
23        return getAllUniquePaths(0, 0, m, n, dp);//x,y
24    }
25}