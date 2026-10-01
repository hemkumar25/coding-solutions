class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int onDelete = 0;
        int ans = arr[0];

        for(int i =1 ; i<arr.length; i++){
            int newNoDelete = Math.max(arr[i],noDelete+arr[i]);
            int newOnDelete = Math.max(noDelete,onDelete+arr[i]);

            noDelete = newNoDelete;
            onDelete = newOnDelete;

            ans = Math.max(ans,Math.max(noDelete, onDelete));
        }
        return ans;
    }
}