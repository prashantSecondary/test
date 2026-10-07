1class Solution {
2
3    public char getRespOpenBrace(char ch){
4        if(ch==')'){
5            return '(';
6        }
7        if(ch=='}'){
8            return '{';
9        }
10        return '[';
11    }
12    public boolean isValid(String s) {
13    
14        Stack<Character> st=new Stack<>();
15
16        String openBraces="([{";
17        
18        int n=s.length();
19        for(int i=0;i<n;i++){
20            char currBrace=s.charAt(i);
21            if(st.isEmpty() && openBraces.indexOf(currBrace)==-1){
22                return false;
23            }
24            if(openBraces.indexOf(currBrace)!=-1){
25                st.push(currBrace);
26            }else{
27                char openBrace=getRespOpenBrace(currBrace);
28                if(!st.isEmpty() && openBrace!=st.peek()){
29                    return false;
30                }else if(!st.isEmpty()){
31                    st.pop();
32                }
33            }
34        }
35        if(st.isEmpty()){
36            return true;
37        }
38
39        return false;
40    }
41}