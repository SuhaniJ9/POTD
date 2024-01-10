class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
         int[] modArr = new int[n];
        int maxLen = 0;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate cumulative sum
            currentSum += a[i];

            // To handle negative numbers, take modulo twice
            modArr[i] = ((currentSum % k) + k) % k;
        }

        // Store remainders in a HashMap
        java.util.HashMap<Integer, Integer> modMap = new java.util.HashMap<>();

        for (int i = 0; i < n; i++) {
            // If current prefix sum is divisible by K
            if (modArr[i] == 0)
                maxLen = i + 1;

            // If current remainder is not present in the map
            else if (!modMap.containsKey(modArr[i]))
                modMap.put(modArr[i], i);

            // If the same remainder is present in the map
            else
                maxLen = Math.max(maxLen, i - modMap.get(modArr[i]));
        }
        return maxLen;// Complete the function
       
    }
 
}
