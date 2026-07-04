class Solution {
    public int maxSum(int[] nums) {
        int maxSum = -1;
        int[] maxForDigit = new int[10];
        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            if (maxForDigit[maxDigit] > 0) {
                maxSum = Math.max(maxSum, num + maxForDigit[maxDigit]);
            }   
            maxForDigit[maxDigit] = Math.max(maxForDigit[maxDigit], num);
        }   
        return maxSum;
    }
    private int getMaxDigit(int num) {
        int maxD = 0;
        while (num > 0) {
            maxD = Math.max(maxD, num % 10);
            num /= 10;
        }
        return maxD;
    }
}