class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        int left=0;

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);

            while(map.get(c)>1){
                char leftc = s.charAt(left);
                map.put(leftc, map.get(leftc)-1);

                if(map.get(leftc)==0){
                    map.remove(leftc);
                }

                left++;
            }

            int tempLen = right -left+1;
            len = Math.max(len, tempLen);

        }
        return len;
    }
}