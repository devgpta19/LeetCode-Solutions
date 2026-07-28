class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            if(!map.containsKey(a))
            map.put(a, 1);
            else
            map.put(a, map.get(a)+1);
        }

        int nums[] = new int[map.size()];
        Set<Integer> set = new HashSet<>();
        int i = 0;
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            nums[i] = entry.getValue();
            i++;
            set.add(entry.getValue());
        }

        if(set.size() == nums.length) return true;

        return false;
    }
}