class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int length = 0;

        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == ' ' && length == 0) continue; // Ignore trailing spaces
            // If a space is found after counting the word, return the length
            if(s.charAt(i) == ' ' && length > 0) return length;
            else length++;  // Count the characters of the last word
        }

        return length;
    }
}