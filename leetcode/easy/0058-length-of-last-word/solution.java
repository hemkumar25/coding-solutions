class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length()-1;
        int len = 0;

        while(l>=0 && s.charAt(l)==' '){
            l--;
        }
        while(l>=0 && s.charAt(l)!=' '){
            len++;
            l--;
        }

        return len;

    }
}