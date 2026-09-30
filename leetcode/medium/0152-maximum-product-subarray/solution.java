class Solution {
    public int maxProduct(int[] nums) {
        int Max = nums[0];
        int Min = nums[0];
        int maxPro = nums[0];

        for(int i= 1 ; i<nums.length; i++){
            int newMax = Math.max(nums[i],Math.max(Min*nums[i],Max*nums[i]));
            int newMin = Math.min(nums[i],Math.min(Min*nums[i],Max*nums[i]));

            Max = newMax;
            Min = newMin;
            maxPro = Math.max(Max, maxPro);
        }
        return maxPro;
    }
}