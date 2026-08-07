class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int x = n/4;

        Map<Integer, Integer> map = new HashMap<>();

        for(int elem : arr){
            if(map.containsKey(elem))
            map.put(elem, map.get(elem)+1);
            else
            map.put(elem, 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > x)
            return entry.getKey();
        }

        return -1;
    }
}