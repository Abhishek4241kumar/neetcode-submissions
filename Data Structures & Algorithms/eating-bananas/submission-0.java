class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canFinish(piles,mid,h)){
                ans = mid;
                high = mid-1;
            } else
              {
                low = mid+1;
              }
        }
        return ans;
    }

    private boolean canFinish(int[] piles, int k, int h){
        long hours = 0;
        for(int n : piles){
            hours += (n+k-1)/k;
        }

        return hours<=h;
    }

    private int getMax(int[] piles){
        int max = 0;
        for(int p : piles){
            if(p> max)
                max = p;      
        }
        return max;
    }
}