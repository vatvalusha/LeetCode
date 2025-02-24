package string;

public class Number_1768 {

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
}
