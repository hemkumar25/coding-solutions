class Solution {
    public int findMin(int[] arr) {
        // code here
        int  n = arr.length;
        int start = 0;
        int end = n-1;
        
        
        while(start<end){
            int mid = start + (end -start)/2;
            
            if(arr[mid]>arr[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return arr[start];
    }
}
