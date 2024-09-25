class Solution {
    public int kthFactor(int n, int k) {
         for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  // i is a factor of n
                k--;  // Decrease k each time we find a factor
                if (k == 0) {
                    return i;  // If we've found the k-th factor, return it
                }
            }
        }
        // If we don't have k factors, return -1
        return -1;
    }
}