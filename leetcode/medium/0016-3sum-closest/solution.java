class Solution {
    public int threeSumClosest(int[] nums, int target) {
        

        Arrays.sort(nums);

        int ans = 0;
        int closeness =Integer.MAX_VALUE;

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]== nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int  sum = nums[i]+ nums[left] + nums[right];

                int tempCloseness = Math.abs(sum - target);

                if(tempCloseness < closeness){
                    closeness= tempCloseness;
                    ans = sum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return ans;
    }
}