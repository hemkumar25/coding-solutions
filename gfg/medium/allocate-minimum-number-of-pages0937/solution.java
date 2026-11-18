class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        
        long minPages = 1;
        long maxPages = 0;
        long ans = -1;
        for(int p: arr){
            minPages = Math.max(minPages, p);
            maxPages += p;
        }
        
        while(minPages<=maxPages){
            long mid = minPages + (maxPages - minPages)/2;
            
            if(isPossible(arr, k, mid)){
                ans = mid;
                maxPages = mid-1;
            }else{
                minPages = mid+1;
            }
        }
        return (int) ans;
        
    }
    
    private boolean isPossible(int [] arr, int k , long mid){
        int count =1;
        long sum =0;
        
        for(int page: arr){
            if(sum + page<=mid){
                sum+=page;
            }else{
                count++;
                sum = page;
            }
        }
        return count <=k;
    }
}