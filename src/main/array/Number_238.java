package array;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */

// [1,2,3,4]
// [1, (1*2)2, (2*3)6, (6*4)24 ]
// [(24*1) 24, (12*2)24, (4*3)12, 4 ]
public class Number_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] array1 = new int[nums.length];
        int[] array2 = new int[nums.length];

        array1[0] = nums[0];
        array2[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            array1[i] = array1[i - 1] * nums[i];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            array2[i] = array2[i + 1] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = array2[i + 1];
                continue;
            }

            if (i == nums.length - 1) {
                result[i] = array1[i - 1];
                break;
            }

            result[i] = array1[i - 1] * array2[i + 1];
        }

        return result;
    }
}
