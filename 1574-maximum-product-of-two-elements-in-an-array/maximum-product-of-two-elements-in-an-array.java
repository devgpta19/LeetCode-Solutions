class Solution {
    public int maxProduct(int[] nums) {
        int maxIdx = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[maxIdx] < nums[i]){
                maxIdx = i;
            }
        }
        int secMaxIdx = (maxIdx == 0) ? 1 : 0;
        for(int i=1; i<nums.length; i++){
            if(nums[secMaxIdx] < nums[i] && i != maxIdx){
                secMaxIdx = i;
            }
        }

        return (nums[maxIdx]-1) * (nums[secMaxIdx]-1);
    }
}