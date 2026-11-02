class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
            Arrays.sort(stalls);

            int n = stalls.length;
            int start = 1;
            int end = stalls[n - 1] - stalls[0];
            int ans = 0;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (canPlaceCows(stalls, k, mid)) {
                    ans = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return ans;
    }
    
    private boolean canPlaceCows(int[] stalls, int k, int distance) {
        int cowsPlaced = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                cowsPlaced++;
                lastPosition = stalls[i];

                if (cowsPlaced >= k) {
                    return true;
                }
            }
        }

        return false;
}
}