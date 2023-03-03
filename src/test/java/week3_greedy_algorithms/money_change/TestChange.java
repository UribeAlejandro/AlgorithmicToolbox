package week3_greedy_algorithms.money_change;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestChange {

    @BeforeEach
    public void setUp() {

    }

    @ParameterizedTest
    @CsvSource({"2, 2", "28, 6"})
    public void testChange(int money, int output) {
        int change = Change.getChange(2);
        assert change == 2;
    }
}
