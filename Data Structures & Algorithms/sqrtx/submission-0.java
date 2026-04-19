class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        if(x==0 || x==1 )
            return x;

        while(start <= end){
            int mid = start + (end-start)/2;
            int square = x/mid;
            if(square == mid){
                return mid;
            }
            if(square < mid)
                end = mid-1;
            else 
                start = mid+1;        
        }
        return end;
    }
}