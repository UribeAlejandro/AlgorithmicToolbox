package week1_programming_challenges.sum_of_two_digits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class APlusBTest {

    private static Stream<Arguments> APlusBTest() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(-1, -1, -2),
                Arguments.of(100, 100, 200)
        );
    }

    @BeforeEach
    public void setup() {

    }

    @ParameterizedTest
    @Timeout(value = 1500, unit = TimeUnit.MILLISECONDS)
    @MethodSource
    @DisplayName("APlusB Test")
    public void APlusBTest(int a, int b, int expected) {
        int sumDigits = APlusB.sumOfTwoDigits(a, b);

        assertEquals(sumDigits, expected);
    }

}