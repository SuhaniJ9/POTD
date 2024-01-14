class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
         Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            StringBuilder rowString = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowString.append(matrix[i][j]);
            }

            String rowKey = rowString.toString();
            if (map.containsKey(rowKey)) {
                result.add(i);
            } else {
                map.put(rowKey, i);
            }
        }

        return result; //code here
    }
}
