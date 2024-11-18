package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void testCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumMaxMonth() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.sumMaxMonth(maxMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumMinMonth() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.sumMinMonth(minMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthUnderAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.countMonthUnderAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthOverAvg() {
        StatsService service = new StatsService();
        long expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.countMonthOverAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
}