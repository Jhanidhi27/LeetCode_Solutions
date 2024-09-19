class Solution {
    int total=0;
    public int numIdenticalPairs(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    total=total+1;
                }
            }
        }
        return total;
        }
}