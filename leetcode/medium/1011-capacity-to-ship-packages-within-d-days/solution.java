class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0; 
        int totalWeight = 0;

        for(int weight: weights){
            maxWeight = Math.max(maxWeight,weight);
            totalWeight += weight;
        }

        while(maxWeight<totalWeight){
            int mid = maxWeight + (totalWeight - maxWeight)/2;

            int daysNeeded = 1;
            int currWeight = 0;

            for(int weight : weights){

                if(currWeight+weight>mid){
                    daysNeeded++;
                    currWeight = 0;
                }
                currWeight += weight;
            }

            if(daysNeeded>days){
                maxWeight = mid+1;
            }else{
                totalWeight = mid;
            }

        }
        return maxWeight;
    }
}