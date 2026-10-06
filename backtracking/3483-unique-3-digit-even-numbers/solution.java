class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();

        int i, j, k, number;
        int n = digits.length;
        
        for (i = 0; i <= n - 1; i++){
            if (digits[i] == 0){
                continue;
            }
            for (j = 0; j <= n - 1; j++){
                if (j == i){
                    continue;
                }
                for (k = 0; k <= n - 1; k++){
                    if (k == i || k == j){
                        continue;
                    }
                    else if(digits[k] % 2 == 0){
                        number = (digits[i] * 100) + (digits[j] * 10) + digits[k];
                        set.add(number);
                    }
                }
            }
        }
        return set.size();
        
    }
}