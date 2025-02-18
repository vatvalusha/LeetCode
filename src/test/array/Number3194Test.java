package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Number3194Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] array, double result) {
        Assertions.assertEquals(new Number_3194().minimumAverage(array), result);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{7,8,3,4,15,13,4,1}, 5.5),
                Arguments.of(new int[]{1,2,3,7,8,9}, 5.0),
                Arguments.of(new int[]{1,9,8,3,10,5}, 5.5)
        );
    }
}