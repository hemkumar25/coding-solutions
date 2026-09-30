class Solution {
    public int minSubarraySum(int[] arr) {
        // code here
        int currSum = arr[0];
        int minSum = arr[0];
        
        for(int i = 01; i<arr.length; i++){
            currSum = Math.min(arr[i],currSum+arr[i]);
            minSum = Math.min(currSum , minSum);
        }
        return minSum;
    }
}