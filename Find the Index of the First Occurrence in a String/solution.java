1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.equals(haystack)){
4            return 0;
5        }
6        int hLen=haystack.length();
7        int nLen=needle.length();
8        int st=0;
9        int ptrH=st,ptrN=0;
10        int res=-1;
11        while(ptrH < hLen && ptrN < nLen){
12            if(haystack.charAt(ptrH)==needle.charAt(ptrN)){
13                if(ptrN==nLen-1){
14                    res=st;
15                    break;
16                }
17                ptrN++;
18                ptrH++;
19            }else{
20                st++;
21                ptrH=st;
22                ptrN=0;
23            }
24        }
25        return res;
26    }
27}