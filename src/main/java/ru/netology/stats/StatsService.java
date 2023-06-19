package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;


    }

    public long average(long[] sales) {
        long averageSum = sum(sales) / 12;
        return averageSum;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                months++;
            }
        }
        return months;
    }

    public int aboveAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                months++;
            }
        }
        return months;
    }
}

