class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            boolean found = false;

            for(; j<t.length(); j++){
                if(s.charAt(i)==t.charAt(j)){
                    found = true;
                    j++;
                    break;
                    
                }
            }

            if(found == false){
                return false;
            }

        }
        return true;
    }
}