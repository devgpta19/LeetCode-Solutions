class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        char []nums1 = num1.toCharArray();
        int x = nums1.length;
        char []nums2 = num2.toCharArray();
        int y = nums2.length;
        
        StringBuilder res = new StringBuilder();
        while(x>0 || y>0 || carry > 0){
            int a = (x > 0) ? (int)((char)nums1[x - 1]-'0') : 0;
            int b = (y > 0) ? (int)((char)nums2[y - 1]-'0') : 0;

            int total = a + b + carry;
            carry = total/10;

            res.append(total%10);
            x--; y--; 
        }

        return res.reverse().toString();
        
    }
}