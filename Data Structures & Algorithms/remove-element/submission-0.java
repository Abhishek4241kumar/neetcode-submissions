class Solution {
    public int removeElement(int[] nums, int val) {
        int s = 0;
        for(int l = 0;l<nums.length;l++){
            if(nums[l] != val){
                nums[s] = nums[l];
                s++;
            }
        }
        return s;
    }
}