import java.util.*;
class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        // int g = nums[0];
        // for(int i=0;i<nums.length;i++){
        //     g = gcd(nums[0], nums[nums.length-1]);
        // }
        // return g;

        return gcd(nums[0], nums[nums.length-1]);
    }

    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
}