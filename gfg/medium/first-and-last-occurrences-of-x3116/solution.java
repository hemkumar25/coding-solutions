class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList <Integer> ans = new ArrayList<>();
        // code here
        int first = firstOccurence(arr, x);
        int last = lastOccurence(arr ,x);
        
        
        ans.add(first);
        ans.add(last);
        
        return ans;
       
    }
    
    int firstOccurence(int arr[], int x){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans= -1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]==x){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }else{
                end =mid-1;
            }
        }
        return ans;
    }
    
     int lastOccurence(int arr[], int x){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans= -1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]==x){
                ans = mid;
                start = mid+1;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }else{
                end =mid-1;
            }
        }
        return ans;
    }
}
