class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if(s.length() <=1)
            return true;
        for(int i =0,j=s.length()-1;i<=j;i++,j--){
            boolean isNotLetter = true;
            while(i < j && isNotLetter){
                if(!Character.isLetterOrDigit(s.charAt(i))){
                    ++i;
                } else isNotLetter = false;
                
            }
            isNotLetter = true;
            while(i < j && isNotLetter){
                if(!Character.isLetterOrDigit(s.charAt(j))){
                    --j;
                } else isNotLetter = false;
                
            }
            
            if(s.charAt(i) != s.charAt(j)) 
                return false;       
        }
        return true;
    }
}
