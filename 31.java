class Solution {
    public static boolean isPossible(int N, int[] coins) {
         boolean[] possible = new boolean[2025];
        possible[0] = true;

        for (int coin : coins) {
            for (int i = 2024; i >= coin; i--) {
                if (possible[i - coin]) {
                    possible[i] = true;
                }
            }
        }

        for (int i = 2024; i >= 1; i--) {
            if (possible[i] && (i % 20 == 0 || i % 24 == 0 || i == 2024)) {
                return true;
            }
        }

        return false;
    }
}
