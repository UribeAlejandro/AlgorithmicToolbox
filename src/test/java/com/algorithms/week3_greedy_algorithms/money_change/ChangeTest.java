package com.algorithms.week3_greedy_algorithms.money_change;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ChangeTest {

    private static Stream<Arguments> ChangeTest() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(28, 6)
        );
    }

    @BeforeEach
    public void setup() {
    }

    @ParameterizedTest
    @Timeout(value = 1500, unit = TimeUnit.MILLISECONDS)
    @MethodSource
    public void ChangeTest(int money, int expected) {

        int nCoins = Change.getChange(money);

        assertEquals(nCoins, expected);

    }


}