class Solution {
    static int splitArray(int[] arr , int N, int K) {
    int maxElement = Integer.MIN_VALUE;
        int sum = 0;

        for (int value : arr) {
            maxElement = Math.max(maxElement, value);
            sum += value;
        }

        int low = maxElement;
        int high = sum;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int splits = 1;
            int currentSum = 0;

            for (int value : arr) {
                currentSum += value;
                if (currentSum > mid) {
                    splits++;
                    currentSum = value;
                }
            }

            if (splits <= K) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
        
    }
}
