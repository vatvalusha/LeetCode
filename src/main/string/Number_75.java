package string;

import java.util.*;

public class Number_75 {

    public String reverseVowels(String s) {
        String result = "";
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
        String[] array = s.split("");
        ArrayList<String> vowelsFromIncome = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (vowels.contains(array[i].toLowerCase())) {
                vowelsFromIncome.add(array[i]);
            }
        }

        reverseArray(vowelsFromIncome);

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (vowels.contains(array[i].toLowerCase())) {
                result += vowelsFromIncome.get(index);
                index++;
            } else {
                result += array[i];
            }
        }


        return result;
    }

    public static void reverseArray(ArrayList<String> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            // Swap elements
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
