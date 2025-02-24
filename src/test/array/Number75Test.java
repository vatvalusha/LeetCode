package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import string.Number_75;

import java.util.stream.Stream;

class Number75Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(String s, String expectedResult) {
        Assertions.assertEquals(new Number_75().reverseVowels(s), expectedResult);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("IceCreAm", "AceCreIm")
        );
    }
}