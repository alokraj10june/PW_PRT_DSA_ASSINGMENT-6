package Assingment6_PRT;

public class Q4 {

    static int findMaxLength(int[] nums) {
        int maxlen = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeroes = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeroes++;
                } else {
                    ones++;
                }
                if (zeroes == ones) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }
}


