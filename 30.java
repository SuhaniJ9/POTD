
class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        if (arr == null || n == 0) {
            return new String[]{"", "0"};
        }

        Map<String, Integer> votes = new HashMap<>();
        
        for (String candidate : arr) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        int maxVotes = 0;
        String winner = "";
        
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            String candidate = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxVotes || (count == maxVotes && candidate.compareTo(winner) < 0)) {
                maxVotes = count;
                winner = candidate;
            }
        }

        return new String[]{winner, Integer.toString(maxVotes)};
    }
}
