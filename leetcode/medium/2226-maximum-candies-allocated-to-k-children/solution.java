class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        for (int candy : candies) {
        max = Math.max(max, candy);
        }

        int start = 1;
        int end = max;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long children = 0;

            for (int candy : candies) {
                children += candy / mid;
            }

            if (children >= k) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;

    }
}