class Solution {
    public boolean solve(int mid,int[] piles , int h){
        long s = 0;
        for(int i=0;i<piles.length;i++){
            s += (piles[i]+mid-1)/mid;
        }
        if(s<=h) return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int r = 0;
        for(int i: piles){
            l = Math.min(l,i);
            r = Math.max(r,i);
        }
        while(r>l){
            int mid = l + (r-l)/2;
            if(solve(mid,piles,h)){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    
        
    }
}