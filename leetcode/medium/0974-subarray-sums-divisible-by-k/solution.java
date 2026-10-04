class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        int count = 0;

        for(int x : nums){
            prefixSum += x;

            int remainder = prefixSum % k ;

            if(remainder<0){
                remainder += k;
            }

            count += map.getOrDefault(remainder, 0);

            map.put(remainder, map.getOrDefault(remainder, 0)+1);
        }
        return count;
    }
}