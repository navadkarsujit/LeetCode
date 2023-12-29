import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int start = 0, end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                // Move the start pointer to the right of the repeated character's last occurrence
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }
            // Update the length of the longest substring without repeating characters
            longest = Math.max(longest, end - start + 1);
            // Update the index of the current character
            charIndexMap.put(currentChar, end);
        }

        return longest;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcabcbb";
        System.out.println("Output 1: " + solution.lengthOfLongestSubstring(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println("Output 2: " + solution.lengthOfLongestSubstring(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println("Output 3: " + solution.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
