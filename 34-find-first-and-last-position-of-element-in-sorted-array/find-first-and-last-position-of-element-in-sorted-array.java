class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1, -1};
        int index = binarySearch(nums, target);
        System.out.println(index);
        if(index == -1)
        return result;
        
        for(int i=index; i<nums.length && nums[i] == target; i++){
            result[1] = i;
        }

        for(int i=index; i>=0 && nums[i] == target; i--){
            result[0] = i;
        }

        return result;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}