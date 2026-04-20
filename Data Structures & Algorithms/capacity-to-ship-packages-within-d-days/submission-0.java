class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = getMax(weights);
        int high = getMaxSum(weights);
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isMidShip(weights,mid,days)){
                ans = mid;
                high = mid-1;
            } else
                low = mid+1;
        }
        return ans;
    }
    private boolean isMidShip(int[] weights, int mid, int days){
        int totalDays = 1;
        int currDay = 0;
        for(int n : weights){
            if(n+currDay<=mid){
                currDay += n;
            } else{
                totalDays ++;
                currDay = n;
            }
        }
        return totalDays <= days;
    }
    private int getMax(int[] arr){
        int max = 0;
        for(int w : arr){
            max = Math.max(max,w);
        }
        return max;
    }
    private int getMaxSum(int[] arr){
        int sum = 0;
        for(int w : arr){
            sum+=w;
        }
        return sum;
    }
}