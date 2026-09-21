class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
       
            int left=0;
            int ans = 0;
            int sum = 0;
            
            for(int right=0; right<arr.length;right++){
                sum +=arr[right];
                if(right-left+1==k){
                    ans =Math.max(ans,sum);
                    sum= sum-arr[left];
                    left++;
                }
                
            }
        return ans;
    }
}