class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length-1;
        int startPosition = Position(nums,target,true);
        int endPosition = Position(nums,target,false);
        int [] result =  {startPosition, endPosition} ;

        return result;

    }

    public int Position(int [] arr, int target, boolean isFirst ){
        int  n = arr.length-1;
        int start = 0;
        int end = n;
        int result = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]== target){
                result =mid;

                if(isFirst){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }else if(arr[mid]<target){
                start= mid+1;
            }else{
                end = mid -1;
            }
        } 
        return result;
    }
}