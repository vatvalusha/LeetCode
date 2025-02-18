package array;

/**
 * You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.
 * <p>
 * You repeat the following procedure n / 2 times:
 * Remove the smallest element, minElement, and the largest element maxElement, from nums.
 * Add (minElement + maxElement) / 2 to averages.
 * Return the minimum element in averages.
 * <p>
 * Example 1:
 * Input: nums = [7,8,3,4,15,13,4,1]
 * Output: 5.5
 * <p>
 * Explanation:
 * step	nums	averages
 * 0	[7,8,3,4,15,13,4,1]	[]
 * 1	[7,8,3,4,13,4]	[8]
 * 2	[7,8,4,4]	[8,8]
 * 3	[7,4]	[8,8,6]
 * 4	[]	[8,8,6,5.5]
 * The smallest element of averages, 5.5, is returned.
 * <p>
 * Constraints:
 * 2 <= n == nums.length <= 50
 * n is even.
 * 1 <= nums[i] <= 50
 */
public class Number_3194 {

    public double minimumAverage(int[] nums) {

        double[] averages = new double[nums.length / 2];
        int max = 50;
        int[] counter = new int[max + 1];

        for (int num : nums) {
            counter[num]++;
        }

        int index = 0;

        for (int i = 1; i <= max; i++) {
            while (counter[i] > 0) {
                nums[index++] = i;
                counter[i]--;
            }
        }

        for (int i = 0; i < averages.length; i++) {
            averages[i] = (nums[i] + nums[(nums.length - 1) - i]) / 2.0;
        }

        double result = Double.MAX_VALUE;
        for(double average : averages){
            double temp = Math.min(result, average);
            if(temp < result){
                result = temp;
            }
        }

        return result;
    }
}
