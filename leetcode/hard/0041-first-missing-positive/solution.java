class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ansExpected =1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<ansExpected){
                continue;
            }
           else if(ansExpected==nums[i] ){
                ansExpected++;
           }
           else if(nums[i]>ansExpected){
                return ansExpected;
           }
        }
        return ansExpected;
    }
}