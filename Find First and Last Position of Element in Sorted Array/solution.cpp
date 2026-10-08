1class Solution {
2public:
3    vector<int> searchRange(vector<int>& nums, int target) {
4        vector<int>store;
5        
6        for(int i=0;i<nums.size();i++){
7            if(target==nums.at(i)){
8                store.push_back(i);
9             }
10        }
11        if(store.empty())
12         return {-1,-1};
13        
14        return {store.front(),store.back()};
15    }
16};