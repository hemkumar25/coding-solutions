class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int MaxFrequency = 0; 
        int maxLen = 0;

        Map<Character, Integer> hm = new HashMap<>();

        for (int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);

            hm.put(ch, hm.getOrDefault(ch,0)+1);
            MaxFrequency = Math.max(MaxFrequency, hm.get(ch));

            while(right-left+1-MaxFrequency>k){
                char leftc = s.charAt(left);
                hm.put(leftc, hm.get(leftc)-1);

                left ++;
            }

            int len = right-left+1;
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}