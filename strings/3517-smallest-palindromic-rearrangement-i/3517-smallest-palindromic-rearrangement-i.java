class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        char[] result = new char[n];
        int left = 0, right = n - 1;
        
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            int count = freq[i] / 2;
            
            for (int j = 0; j < count; j++) {
                result[left++] = ch;
                result[right--] = ch;
            }
            
            if (freq[i] % 2 == 1) {
                result[n / 2] = ch; 
            }
        }
        
        return new String(result);
    }
}