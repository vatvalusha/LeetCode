package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Number3195Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[][] array, int result) {
        Assertions.assertEquals(new Number_3195().minimumArea(array), result);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[][]{{0,1,0},{1,0,1}}, 6),
                Arguments.of(new int[][]{{0,0,1,0,0},{0,1,0,0,1},{0,0,1,0,1}}, 12),
                Arguments.of(new int[][]{{1,0},{0,0}}, 1),
                Arguments.of(new int[][]{{0,1}}, 1),
                Arguments.of(new int[][]{{1},{1}}, 2)
        );
    }

}