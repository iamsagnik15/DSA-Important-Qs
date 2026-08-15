class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int totalXOR=0;
        for(int num:nums){
            totalXOR ^=num;
        }
        if(totalXOR != 0){
            return n;
        }
        for(int num:nums){
            if(num !=0){
                return n-1;
            }
        }
        return 0;
    }
}