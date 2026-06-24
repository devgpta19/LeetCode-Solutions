import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                map.put(nums[i], indices);
            }else{
                List<Integer> indices = map.get(nums[i]);
                indices.add(i);
            }
        }
        int minDistance = Integer.MAX_VALUE;
        for (List<Integer> indices : map.values()) {
            if (indices.size() < 3) continue;
            for (int i = 0; i <= indices.size() - 3; i++) {
                int firstIdx = indices.get(i);
                int thirdIdx = indices.get(i + 2);
                int distance = 2 * (thirdIdx - firstIdx);
                minDistance = Math.min(minDistance, distance);
            }
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}