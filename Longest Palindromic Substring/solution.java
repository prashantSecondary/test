1class Solution {
2    public boolean[][] getIsPallindromeList(String s){
3        int n=s.length();
4        boolean[][] isPallindrome=new boolean[n][n];
5        //initialize
6        //1: one char already pallindrome ; 2: two char pallind. if same 
7        for(int i=0;i<n;i++){
8            for(int j=i;j<n;j++){
9                if(j==i){
10                    isPallindrome[i][j]=true;
11                }else if(j-1==i){
12                    if(s.charAt(i)==s.charAt(j)){
13                        isPallindrome[i][j]=true;
14                    }
15                }
16            }
17        }
18        //fill
19        for(int j=2;j<n;j++){
20            for(int i=0;i<j-1;i++){
21                if(s.charAt(i)==s.charAt(j)){
22                    isPallindrome[i][j]=isPallindrome[i+1][j-1];
23                }
24            }
25        }
26        return isPallindrome;
27    }
28    public String longestPalindrome(String s) {
29        int n=s.length();
30        boolean[][]isPallindrome=getIsPallindromeList(s);
31        int startOfLongest=-1;
32        int maxLen=0;
33        for(int i=0;i<n;i++){
34            for(int j=i;j<n;j++){
35                if(isPallindrome[i][j]){
36                    if(j-i+1>maxLen){
37                        maxLen=j-i+1;
38                        startOfLongest=i;
39                    }
40                }
41            }
42        }
43        return s.substring(startOfLongest,startOfLongest+maxLen);
44
45    }
46}