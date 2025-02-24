package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArray80Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] num, int expectedResult) {
        Assertions.assertEquals(new RemoveDuplicatesFromSortedArray_80().removeDuplicates(num), expectedResult);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
//                Arguments.of(new int[]{1,1,1,2,2,3}, 5),
                Arguments.of(new int[]{0,0,1,1,1,1,2,3,3}, 7)
        );
    }
}