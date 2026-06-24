public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

            
        int s = 0;
        int n = x;
        while (n > 0) {
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if(x == s)
        return true;
        else
        return false;
    }
}