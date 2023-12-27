public class 23 
{
     
    public int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Count the frequency of each element in the array
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        // Calculate the threshold count
        int threshold = n / k;
        
        // Count elements that appear more than n/k times
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > threshold) {
                count++;
            }
        }
        
        return count;
    }
}