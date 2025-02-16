package array;

import java.util.ArrayList;
import java.util.List;

public class Number_1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();

        int maxNumber = 0;

        for (int candy : candies) {
            if (candy > maxNumber) {
                maxNumber = candy;
            }
        }

        for (int candy : candies) {
            result.add((candy + extraCandies) >= maxNumber);
        }

        return result;
    }
}
