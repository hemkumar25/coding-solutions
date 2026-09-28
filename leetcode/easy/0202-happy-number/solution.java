class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(true){
            slow = getNxt(slow);
            fast = getNxt(getNxt(fast));

            if(slow==fast){
                break;
            }
        }
        return slow == 1;
    }

    private int getNxt ( int n){
        int sum = 0;

        while(n>0){
            int digit = n%10;
            sum = sum+ digit*digit;
            n = n/10;
        }
        return sum;
    }
}