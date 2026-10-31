class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        int start = 0;
        int end = n-1;
        
        while(start<end){
            int mid = start + (end - start)/2;
            
            if(arr[mid]<x){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        
        return arr[end]<x?-1:end;
    }
}
