class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
       ArrayList<Integer> indices = new ArrayList<>();

        int txtLen = txt.length();
        int patLen = pat.length();

        // Iterate through the text string to find occurrences of the pattern
        for (int i = 0; i <= txtLen - patLen; i++) {
            boolean found = true;

            // Check for pattern match starting from index i in the text string
            for (int j = 0; j < patLen; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    found = false;
                    break;
                }
            }

            // If pattern is found at index i, add the index to the result list
            if (found) {
                indices.add(i + 1); // Convert zero-based indexing to one-based indexing
            }
        }

        return indices;
    }
}
