class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int count = 0;
        
        for(int i=0; i<arr.length-2; i++){
            
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            
            int left = i+1;
            int right= arr.length-1;
            
            while(left<right){
                int currSum = arr[i]+ arr[left]+ arr[right];
                
                if (currSum<sum){
                    count+= right-left;
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        
        return count;
    }
}