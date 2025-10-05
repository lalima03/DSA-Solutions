package arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0; // 0 XORed with any number gives the number, two same numbers XORed give 0
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
