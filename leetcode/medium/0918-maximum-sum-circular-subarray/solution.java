class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = nums[0];
        int maxSum = nums[0];
        int currMax = nums[0];

        int minSum = nums[0];
        int currMin = nums[0];

        for(int i = 1 ; i< nums.length; i++){
            int  x = nums[i];
            total += x;

            currMax = Math.max(x, currMax + x);
            maxSum = Math.max(currMax , maxSum);

            currMin = Math.min(x, currMin + x);
            minSum = Math.min(currMin, minSum);

            
        }

        if(maxSum<0){
            return maxSum;
        }

        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}