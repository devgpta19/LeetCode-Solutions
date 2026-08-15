class Solution {
    public int maximumLengthSubstring(String s) {
        int[] counts = new int[26];
        int left = 0;
        int max = 0;

        for(int i=0;i<s.length();i++){
            counts[s.charAt(i) - 'a'] ++;

            while(counts[s.charAt(i) - 'a'] > 2){
                counts[s.charAt(left)-'a']--;
                left++;
            }
            max = Math.max(max,i-left+1);
        }

        return max;
    }
}