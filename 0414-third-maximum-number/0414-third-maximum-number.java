class Solution {
    public int thirdMax(int[] nums) {

        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;

        for (int n : nums) {

            // Ignore duplicates
            if (n == f || n == s || n == t) {
                continue;
            }

            if (n > f) {
                t = s;
                s = f;
                f = n;
            }
            else if (n > s) {
                t = s;
                s = n;
            }
            else if (n > t) {
                t = n;
            }
        }

        // If third maximum doesn't exist
        if (t == Long.MIN_VALUE) {
            return (int) f;
        }

        return (int) t;
    }
}