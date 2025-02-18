package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Number2974Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] array, int[] result) {
        Assertions.assertArrayEquals(new Number_2974().numberGame(array), result);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 2, 3}, new int[]{3, 2, 5, 4}),
                Arguments.of(new int[]{2, 5}, new int[]{5, 2})
        );
    }

}