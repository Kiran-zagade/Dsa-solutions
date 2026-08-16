import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s){
        String current ="";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (current.contains(String.valueOf(ch))) {
                current = current.substring(1);
            }
            current += ch;
            max = Math.max(max, current.length());
        }
        return max;
    }
}