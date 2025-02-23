package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RemoveElement27Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] num, int val, int expectedResult) {
        Assertions.assertEquals(new RemoveElement_27().removeElement(num, val), expectedResult);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{3,2,2,3}, 3, 2)
        );
    }
}