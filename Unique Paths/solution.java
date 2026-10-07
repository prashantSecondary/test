1class Solution {
2    public int countUniquePaths(int m,int n,int currRow,int currCol,int[][]dp){
3        if(currRow==m-1 && currCol==n-1){
4            return 1;
5        }
6        if(dp[currRow][currCol]!=-1){
7            return dp[currRow][currCol];
8        }
9        //right
10        int c1=0;
11        if(currCol+1<=n-1){
12            c1=countUniquePaths(m,n,currRow,currCol+1,dp);
13        }
14        //down
15        int c2=0;
16        if(currRow+1<=m-1){
17            c2=countUniquePaths(m,n,currRow+1,currCol,dp);
18        }
19
20        dp[currRow][currCol]= c1+c2;
21        return c1+c2;
22    }
23    public int uniquePaths(int m, int n) {
24        int[][]dp=new int[m][n];
25        for(int i=0;i<m;i++){
26            Arrays.fill(dp[i],-1);
27        }
28        return countUniquePaths(m,n,0,0,dp);
29    }
30}