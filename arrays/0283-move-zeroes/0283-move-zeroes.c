void moveZeroes(int nums[], int n) {
// Mohd Altamish
    int j = 0;
    int i, temp;

    for (i = 0; i < n; i++){
        if (nums[i] != 0) {
            if (i != j ){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }
    }
}