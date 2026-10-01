class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        int minSum = nums[0];
        int currMin = nums[0];

        for(int i =1; i<nums.length; i++){
            int x =  nums[i];
            currSum = Math.max(x, currSum + x );
            maxSum = Math.max(currSum, maxSum);

            currMin = Math.min(x,currMin + x);
            minSum =Math.min(currMin, minSum);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}