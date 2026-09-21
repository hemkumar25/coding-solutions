class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len =Integer.MAX_VALUE;
        int sum=0;
        int left = 0;
        int right = 0;

        while(right<=nums.length-1){
            sum = sum+nums[right];

            while(sum>=target){
                int templen = right -left+1;

                len = Math.min(templen, len);

                sum = sum - nums[left];

                left++;
                
            }

            right++;
        }
        return len == Integer.MAX_VALUE? 0:len;
    }
}