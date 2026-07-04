import java.util.*;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        int[] startArray = new int[n];
        int[] endArray = new int[n];
        int[] childTime = new int[n]; 
        Arrays.fill(startArray, 0);
        Arrays.fill(endArray, 0);
        Arrays.fill(childTime, 0);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> timeStack = new Stack<>();
        for (String log : logs) {
            String[] arr = log.split(":");
            int func = Integer.parseInt(arr[0]);
            int timestamp = Integer.parseInt(arr[2]);
            if (arr[1].equals("start")) {
                stack.push(func);
                timeStack.push(timestamp);
                
                startArray[func] += timestamp; 
            }
            else if (arr[1].equals("end")) {
                int poppedFunc = stack.pop();
                int poppedStart = timeStack.pop();
                int duration = timestamp - poppedStart + 1;
                endArray[poppedFunc] += (timestamp + 1); 
                if (!stack.isEmpty()) {
                    int parentFunc = stack.peek();
                    childTime[parentFunc] += duration;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = (endArray[i] - startArray[i]) - childTime[i];
        }
        return result;
    }
}