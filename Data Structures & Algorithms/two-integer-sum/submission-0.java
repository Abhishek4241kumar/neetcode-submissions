class Solution {
    public int[] twoSum(int[] nums, int k) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i = 1;i<nums.length;i++){
            if(map.containsKey(k-nums[i])){
                ans[0] = map.get(k-nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
