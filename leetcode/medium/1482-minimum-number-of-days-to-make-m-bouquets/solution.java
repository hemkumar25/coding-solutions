class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int minDays = 1;
        int maxDays = 0;

        for(int day: bloomDay){
            maxDays = Math.max(maxDays,day);
        }

        int ans = -1;

        while(minDays<=maxDays){
            int mid = minDays+(maxDays-minDays)/2;

            if(isPossible(bloomDay, mid, m , k)){
                ans = mid;
                maxDays = mid-1;
            }else{
                minDays = mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int [] bloomDay, int days, int m, int k){
        int boquets = 0;
        int flowers = 0;

        for(int bloom:bloomDay){
            if(bloom <= days){
                flowers++;
                if(flowers == k){
                    boquets++;
                    flowers=0;
                }
            }else{
                flowers = 0;
            }
        }
        return boquets >= m;
    }
}