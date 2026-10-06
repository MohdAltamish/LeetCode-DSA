class Solution {
    public int distinctSubseqII(String s) {
        final long MOD = 1_000_000_007L;

        long[] last = new long[26];
        long dp = 1;

        for(char ch: s.toCharArray()){
            int c = ch - 'a';
            long newDp = (2 * dp - last[c] + MOD) % MOD;
            last[c] = dp;
            dp = newDp;
        }
        return (int) ((dp - 1 +  MOD) % MOD);
        
    }
}