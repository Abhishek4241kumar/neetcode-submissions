class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int one = 0;
        int two = 0;
        int size1 = word1.length();
        int size2 = word2.length();
        int i = 0;
        while(one!=size1 || two!=size2){
            if(one == size1){
                ans = ans + word2.charAt(two);
                two++;
                i++;
            } else if(two == size2){
                ans = ans + word1.charAt(one);
                one++;
                i++;
            } else{
                if(i%2 == 0){
                    ans = ans + word1.charAt(one);
                    one++;
                i++;
                } else {
                    ans = ans + word2.charAt(two);
                two++;
                i++;
                }
            }
        }

        return ans;
    }
}