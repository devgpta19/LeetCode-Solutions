class Solution {
    public void reverseString(char[] s) {
        char[] result = new char[s.length];
        for(int i=s.length-1; i>=0 ;i--){
            result[s.length-1-i] = s[i];
        }

        for(int i=0;i<s.length;i++){
            s[i] = result[i];
        }
    }
}