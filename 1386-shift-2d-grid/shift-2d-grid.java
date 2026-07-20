class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;

        k = k%total;

        int[][] result = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int newIndex = ((i * n) + j + k) % total;

                int newRow = newIndex / n;
                int newColumn = newIndex % n;

                result[newRow][newColumn] = grid[i][j];
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(result[i][j]);
            }
            list.add(row);
        }

        return list;
    }
}