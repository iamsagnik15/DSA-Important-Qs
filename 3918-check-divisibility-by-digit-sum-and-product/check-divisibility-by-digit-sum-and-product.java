class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int digitsum=0;
        int digitproduct=1;
        while(n>0){
            int digit=n%10;
            digitsum=digitsum+digit;
            digitproduct=digit*digitproduct;
            n=n/10;
        }
        int divisor=digitsum+digitproduct;
        return original %  divisor==0;
    }
}