package week1_programming_challenges.maximum_pairwise_product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class MaxPairwiseProductTest {
    private static Stream<Arguments> MaxPairwiseProductTest() {
        return Stream.of(
                Arguments.of(new int[]{5, 5}, 25),
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{7, 5, 14, 2, 8, 8, 10, 1, 2, 3}, 140)
        );
    }

    @BeforeEach
    public void setup() {
    }

    @ParameterizedTest
    @Timeout(value = 1500, unit = TimeUnit.MILLISECONDS)
    @MethodSource
    @DisplayName("MaxPairwiseProductTest")
    public void MaxPairwiseProductTest(int[] numbers, int expected) {
        int maxPairWise = MaxPairwiseProduct.getMaxPairwiseProduct(numbers);

        Assertions.assertEquals(maxPairWise, expected);
    }
}