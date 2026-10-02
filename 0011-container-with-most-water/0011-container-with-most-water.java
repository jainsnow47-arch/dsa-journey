class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){

            int l=right-left;
            int b=Math.min(height[left],height[right]);
            int area=l*b;
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
            maxArea=Math.max(area,maxArea);
        }
            
    return maxArea;
}
}