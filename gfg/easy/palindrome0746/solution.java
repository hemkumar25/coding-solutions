class Solution {
    public boolean isPalindrome(int n) {
        // code here
        return n == reverse(n,0);
    }
    
    public int reverse(int n,int rev){
        if(n == 0){
            return rev;
        }
        
         int temp = n%10;
         rev = rev*10 + temp;
         
         return reverse(n/10, rev);
         
    }
}