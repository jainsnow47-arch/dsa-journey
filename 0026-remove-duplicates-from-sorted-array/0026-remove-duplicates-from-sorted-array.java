class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        int i = 0;
        int idx = 1;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[idx++]=nums[j];
                i = j;
            }
        }
        return idx;
    }
}