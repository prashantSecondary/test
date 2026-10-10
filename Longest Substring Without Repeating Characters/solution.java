1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n=s.length();
4        int len=0;
5        int maxLen=0;
6        for(int i=0;i<n;i++){
7            boolean[] visited=new  boolean[256];
8            len=0;
9            for(int j=i;j<n;j++){
10                if(visited[s.charAt(j)]){
11                    break;
12                }
13                len++;
14                visited[s.charAt(j)]=true;
15            }
16            maxLen=Math.max(len,maxLen);
17        }
18        return maxLen;
19    }
20}