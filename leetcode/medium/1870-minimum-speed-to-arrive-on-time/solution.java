class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int d: dist){
            maxSpeed = Math.max(maxSpeed,d);
        }

        if (hour <= dist.length - 1) {
            return -1;
        }

        int lastSpeed = (int) Math.ceil(dist[dist.length - 1] / (hour - dist.length + 1));
        maxSpeed = Math.max(maxSpeed, lastSpeed);

        int ans = -1;

        while(minSpeed<=maxSpeed){
            int mid = minSpeed +(maxSpeed- minSpeed)/2;

            double time = 0;

            for(int i=0; i<dist.length;i++){
                if(i==dist.length-1){
                    time += (double)dist[i]/mid; 
                }else{
                    time +=( dist[i]+(long)mid-1)/mid;
                }
            }

            if(time<=hour){
                ans = mid;
                maxSpeed = mid -1;
            }else{
                minSpeed = mid+1;
            }

        }
        return ans;
    }
}