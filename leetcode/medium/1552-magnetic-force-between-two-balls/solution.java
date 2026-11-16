class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int minDistance = 1;
        int maxDistance = position[position.length-1]-position[0];
        int ans = -1;
        while(minDistance<=maxDistance){
            int mid = minDistance + ( maxDistance - minDistance)/2;
            
            if(isPossible(position,m,mid)){
                ans = mid;
                minDistance = mid+1;
            }else{
                maxDistance = mid-1;
            }

        }
        return ans;
    }


    private boolean isPossible(int [] position, int m, int distance ){
        int balls =1;
        int lastPosition = position[0];

        for(int i=1; i<position.length; i++){
            if(position[i] - lastPosition>=distance){
                balls++;
                lastPosition = position[i];
            }

            if(balls>=m){
                return true;
            }
        }
        return false;
    }
}