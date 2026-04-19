class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }

    public int search(int[] arr, int target, int start, int end){
        int middle = (start+end)/2;
        if(arr[middle]==target)
            return middle;
        if(start>end){
            if(arr[middle]>target)
                return middle;
            else 
                return middle+1;
        }
            
        if(arr[middle]>target)
            return search(arr,target,start,middle-1);
        else
            return search(arr,target,middle+1,end);    
    }
}