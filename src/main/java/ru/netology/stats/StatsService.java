package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthLowAvg(int[] sales) {
        int month = 0;
        int monthLowAvg = 0;
        int avg = findAvg(sales);
        for (int sale : sales) {
            if (sale < avg) {
                monthLowAvg = monthLowAvg + 1;
            }
        }
        return monthLowAvg;
    }

    public int monthHighAvg(int[] sales) {
        int month = 0;
        int monthHighAvg = 0;
        int avg = findAvg(sales);
        for (int sale : sales) {
            if (sale > avg) {
                monthHighAvg = monthHighAvg + 1;
            }
        }
        return monthHighAvg;
    }
}
