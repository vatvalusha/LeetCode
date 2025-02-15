import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }
        return result;
    }

    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            result.append(i < array1.length ? array1[i] : "");
            result.append(i < array2.length ? array2[i] : "");
        }

        return result.toString();
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return str2.substring(0, a);
    }


}