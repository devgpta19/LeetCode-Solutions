import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++)
        set.add(nums1[i]);

        for(int i: nums2){
            if(set.contains(i))
            resultSet.add(i);
        }
        int[] resultArray = new int[resultSet.size()];
        int index = 0;
        for (Integer value : resultSet) {
            resultArray[index++] = value; 
        }

        return resultArray;
    }
}