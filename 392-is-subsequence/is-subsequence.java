class Solution {
    public boolean isSubsequence(String s, String t) {
 

        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        while (j < t.length()) {

            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}