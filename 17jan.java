class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // Convert ArrayList to array for sorting
        Integer[] arrArray = new Integer[n];
        arrArray = arr.toArray(arrArray);
        Arrays.sort(arrArray); // Sort the array to ensure unique permutations

        backtrack(result, new ArrayList<>(), arrArray, new boolean[n]);

        return result;
    }

    private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, Integer[] arr, boolean[] used) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            // Skip the element if it has been used or if it's a duplicate
            if (used[i] || (i > 0 && arr[i].equals(arr[i - 1]) && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            current.add(arr[i]);

            backtrack(result, current, arr, used);

            used[i] = false;
            current.remove(current.size() - 1);    // code here
    }
    }
}
