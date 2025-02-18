package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Number443Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolutionc(char[] array, int result) {
        Assertions.assertEquals(new Number_443().compress(array), result);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
//                Arguments.of(new char[]{'a','a','b','b','c','c','c'}, 6),
                Arguments.of(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}, 4)
        );
    }
}