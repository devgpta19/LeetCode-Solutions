import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, int[]> rowMatrix = new HashMap<>();
        
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            
            if (col >= 2 && col <= 9) {
                rowMatrix.putIfAbsent(row, new int[8]);
                
                int matrixIndex = col - 2; 
                rowMatrix.get(row)[matrixIndex] = 1;
            }
        }
        
        int totalCount = (n - rowMatrix.size()) * 2;
        
        for (int[] row : rowMatrix.values()) {
            
            boolean leftAvailable = (row[0] == 0 && row[1] == 0 && row[2] == 0 && row[3] == 0);
                                    
            boolean rightAvailable = (row[4] == 0 && row[5] == 0 && row[6] == 0 && row[7] == 0);
                                     
            boolean middleAvailable = (row[2] == 0 && row[3] == 0 && row[4] == 0 && row[5] == 0);
            
            if (leftAvailable && rightAvailable) {
                totalCount += 2; 
            } else if (leftAvailable || rightAvailable || middleAvailable) {
                totalCount += 1; 
            }
        }
        
        return totalCount;
    }
}
