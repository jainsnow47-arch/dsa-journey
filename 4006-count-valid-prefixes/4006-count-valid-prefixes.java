class Solution {
    public int countValidPrefixes(String s) {
        int n = s.length();
        int count = 0;
        int one = 0;
        int zero = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            else{
                 one++;
            }
            if(Math.abs(zero-one)<=1){
                count++;
            }
        }
        return count;
    }
}