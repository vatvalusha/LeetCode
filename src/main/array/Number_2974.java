package array;

import java.util.Arrays;

/**
 * You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:
 * <p>
 * Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
 * Now, first Bob will append the removed element in the array arr, and then Alice does the same.
 * The game continues until nums becomes empty.
 * Return the resulting array arr.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,4,2,3]
 * Output: [3,2,5,4]
 * Explanation: In round one, first Alice removes 2 and then Bob removes 3. Then in arr firstly Bob appends 3 and then Alice appends 2. So arr = [3,2].
 * At the begining of round two, nums = [5,4]. Now, first Alice removes 4 and then Bob removes 5. Then both append in arr which becomes [3,2,5,4].
 */
public class Number_2974 {

    public int[] numberGame(int[] nums) {
        int[] result = new int[nums.length];
        this.countingSort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            result[i + 1] = nums[i];
            result[i] = nums[i + 1];
        }

        return result;
    }

    public void countingSort(int[] arr) {
        if (arr.length == 0) return;

//        int max = Arrays.stream(arr).max().getAsInt();
        int max = 100;

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

}
