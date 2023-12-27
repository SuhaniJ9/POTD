public class Main {
    class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n = matrix.length;
        List<Integer> result = new ArrayList<>();

        // Traverse each diagonal starting from the top row
        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = i;
            while (col >= 0 && row < n) {
                result.add(matrix[row][col]);
                row++;
                col--;
            }
        }

        // Traverse each diagonal starting from the second row
        for (int i = 1; i < n; i++) {
            int row = i;
            int col = n - 1;
            while (row < n && col >= 0) {
                result.add(matrix[row][col]);
                row++;
                col--;
            }
        }

        // Convert ArrayList to int array
        int[] antiDiagonals = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            antiDiagonals[i] = result.get(i);
        }

        return antiDiagonals;
       
         }
}
}
