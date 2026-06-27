class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int one = 0;
        int two = 0;
        int size1 = word1.length();
        int size2 = word2.length();
        int i = 0;
        while (one < size1 && two < size2) {
    ans.append(word1.charAt(one++));
    ans.append(word2.charAt(two++));
}

while (one < size1)
    ans.append(word1.charAt(one++));

while (two < size2)
    ans.append(word2.charAt(two++));

        return ans.toString();
    }
}