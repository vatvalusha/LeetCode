package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Number334Test {
    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] array, boolean result) {
        Assertions.assertEquals(new Number_334().increasingTriplet(array), result);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2,1,5,0,3}, false),
                Arguments.of(new int[]{2,1,5,0,4,6}, true)
        );
    }
}