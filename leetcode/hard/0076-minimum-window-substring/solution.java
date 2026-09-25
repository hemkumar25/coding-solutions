class Solution {
    public String minWindow(String s, String t) {
        int [] need = new int[128];

        for(char c : t.toCharArray()){
            need[c]++;
        }

        int left=0; 
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            if(need[c]>0){
                count--;
            }
            need[c]--;

            while(count == 0){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }

                char leftc = s.charAt(left);
                need[leftc]++;

                if(need[leftc]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE?"": s.substring(start,start+minLen);
    }
}