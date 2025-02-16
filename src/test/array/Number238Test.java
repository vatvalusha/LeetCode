package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Number238Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] array, int[] result) {
        Assertions.assertArrayEquals(new Number_238().productExceptSelf(array), result);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, new int[]{24,12,8,6})
        );
    }

}