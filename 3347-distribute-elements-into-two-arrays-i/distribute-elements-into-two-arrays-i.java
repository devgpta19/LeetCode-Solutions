class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i=2; i<nums.length;i++){
            int e1 = list1.get(list1.size()-1);
            int e2 = list2.get(list2.size()-1);

            if(e1 > e2) list1.add(nums[i]);
            else list2.add(nums[i]);
        }

        int [] arr = new int[nums.length];
        int i = 0;

        for(int num : list1){
            arr[i] = num;
            i++;
        }

        for(int num : list2){
            arr[i] = num;
            i++;
        }

        return arr;
    }
}