class Solution {
    public int removeDuplicates(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0;
        ans[0] = nums[0];

        for(int i =1;i<nums.length;i++){
            if(ans[j] != nums[i]){
                j++;
                ans[j] = nums[i];

            }
        }
        int k =0;
        while(k<nums.length){
            nums[k] = ans[k];
            k++;
        }
        for(int i: nums){
            System.out.print(i);
        }
        
        return j+1;
    }
}