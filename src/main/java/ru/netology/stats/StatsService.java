package ru.netology.stats;

public class StatsService {
    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAvg(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int sumMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthUnderAvg(long[] sales) {
        int count = 0;
        long avgSales = calculateAvg(sales);
        for (long sale : sales) {
            if (sale < avgSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthOverAvg(long[] sales) {
        int count = 0;
        long avgSales = calculateAvg(sales);
        for (long sale : sales) {
            if (sale > avgSales) {
                count++;

            }
        }
        return count;
    }
}
