package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {123, 52, 812, 442, 40, 3, 22, 66, 101, 95, 73};
        long expected = 812;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}