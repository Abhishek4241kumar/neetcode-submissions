class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        return binary(nums,min,0,nums.length-1);
    }
    private int binary(int[] nums,int min, int low, int high){
        if(low> high)
            return min;
        int mid = low + (high-low)/2;
        if(nums[mid]< min){
            min = nums[mid];
        }
        if(nums[mid]> nums[high]){
            return binary(nums,min,mid+1,high);
        } else if(nums[mid] < nums[high]){
            return binary(nums,min,low,mid-1);
        }

        return min;    
    }
}
