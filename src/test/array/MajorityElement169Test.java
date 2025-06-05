package array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MajorityElement169Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] num, int expectedResult) {
        Assertions.assertEquals(new MajorityElement_169().majorityElement(num), expectedResult);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2),
                Arguments.of(new int[]{3,2,3}, 3),
                Arguments.of(new int[]{3,3,4}, 3),
                Arguments.of(new int[]{-1,1,1,1,2,1}, 1)
        );
    }

}