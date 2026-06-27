class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        int prevIndex = -1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                prevIndex = map.get(nums[i]);
                minDistance = Math.min(minDistance, Math.abs(i-prevIndex));
                map.put(nums[i], i);
            }else{
                map.put(nums[i], i);
            }
            prevIndex = i;
        }

        return minDistance <= k ? true : false;
    }
}