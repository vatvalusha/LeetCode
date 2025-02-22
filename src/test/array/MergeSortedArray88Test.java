package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArray88Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] num1, int m, int[] num2, int n, int[] expectedResult) {
        Assertions.assertArrayEquals(new MergeSortedArray_88().merge(num1, m, num2, n), expectedResult);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1})
        );
    }
}