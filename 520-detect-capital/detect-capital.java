class Solution {
    public boolean detectCapitalUse(String word) {
        char[] charr = word.toCharArray();
        boolean flag = false;
        int count = 0;
        for(int i=0;i<charr.length;i++){
            if(charr[i]>=65 && charr[i]<=90){
                count++;
            }
        }
        if(count == charr.length || count == 0) return true;

        if(charr[0] >= 65 && charr[0] <= 90){
            count = 1;
            for(int i=1;i<charr.length;i++){
                if(charr[i] >= 97 && charr[i] <= 122){
                    count++;
                }
            }

            if(count == charr.length) return true;
        }
        return false;
    }
}