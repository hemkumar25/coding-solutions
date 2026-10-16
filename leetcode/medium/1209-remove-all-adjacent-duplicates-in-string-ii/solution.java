class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] chars = new char[n];
        int[] count = new int[n];

        int top= -1;
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(top>=0 && chars[top]==ch){
                top++;
                chars[top]=ch;
                count[top] = count[top-1]+1;
            }
            else{
                top++;
                chars[top]=ch;
                count[top] = 1; 
            }

            if(count[top]==k){
                top-=k;
            }
        }

        return new String(chars, 0 , top+1);
    }
}