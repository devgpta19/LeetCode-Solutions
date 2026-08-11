class Solution {
    public int missingInteger(int[] nums) {
        int count = 1;
        if(nums.length == 0) return 0;
        
        int sum = nums[0];
        int maxSum = Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i - 1] + 1)
            {
                count++;
                sum += nums[i];
                continue;
            }
            maxSum = Math.max(maxSum, sum);
            break;
        }

        if(maxSum == Integer.MIN_VALUE)
        maxSum = sum;

        int i=0;
        while(i < nums.length){
            if(maxSum == nums[i]){
                maxSum++;
                i=0;
            }else{
                i++;
            }
        }
        
        return maxSum;
    }
}