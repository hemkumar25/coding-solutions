class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character,Integer> hm = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        
        for(int right=0; right<s.length();right++){
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
            
            while(hm.size()>k){
                char c = s.charAt(left);
                hm.put(c, hm.get(c)-1);
                
                if(hm.get(c)==0){
                    hm.remove(c);
                }
                left++;
            }
            
            if(hm.size()==k){
                int len = right-left+1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen == 0? -1:maxLen;
    }
}