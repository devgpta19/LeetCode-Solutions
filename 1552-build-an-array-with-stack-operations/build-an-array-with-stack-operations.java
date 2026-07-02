class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> stack = new ArrayList<>();
        int top = 0; 
        
        for (int i = 1; i <= n; i++) {
            if (top == target.length) {
                break;
            }
            stack.add("Push");
            if (i == target[top]) {
                top++;
            } else {
                stack.add("Pop");
            }
        }
        
        return stack;
    }
}