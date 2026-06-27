class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int one = 0;
        int two = 0;
        int[] ans = new int[n+m];
        int i = 0;
        while(one<m && two<n){
            if(nums1[one] <= nums2[two]){
                ans[i] = nums1[one];
                one++;
            }
            else{
                ans[i] = nums2[two];
                two++;
            }
            i++;
        }
        while(one<m){
            ans[i] = nums1[one];
            i++;
            one++;
        }

        while(two<n){
            ans[i] = nums2[two];
            i++;
            two++;
        }

        for(int j =0;j<ans.length;j++){
            nums1[j] = ans[j];
        }
        
    }
}