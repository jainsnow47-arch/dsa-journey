class Solution {
    public long sumAndMultiply(int n) {
        long m = n;
        long num = 0;
        while(m!=0){
            long r=m%10;
            if(r!=0){
                num=num*10+r;
            }
            m/=10;
        } 
        long num2 = 0;
        long sum = 0;
        while(num!=0){
            long r = num%10;
            sum+=r;
            num2 = num2*10 + r;
            num/=10;
        }
        return num2*sum;
    }
}