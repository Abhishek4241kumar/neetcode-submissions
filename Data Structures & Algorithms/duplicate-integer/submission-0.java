class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i))
                    ans = true;
            else map.put(i,i);        
        }

        return ans;
    }
}