package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class RemoveDuplicatesFromSortedArrayTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] num, int expectedResult) {
        Assertions.assertEquals(new RemoveDuplicatesFromSortedArray_26().removeDuplicates(num), expectedResult);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, 2)
        );
    }
}