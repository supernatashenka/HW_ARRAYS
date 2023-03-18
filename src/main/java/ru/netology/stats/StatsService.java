package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales = allSales + sale;

        }
        return allSales;

    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                monthMax = i;
                maximumSale = sales[i];

            }

        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        long minimumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                monthMin = i;
                minimumSale = sales[i];

            }

        }
        return monthMin + 1;
    }

    public int monthsLowerAverage(long[] sales) {
        int monthsLower = 0;
        long averageSale = sum(sales) / sales.length;
        for (long sale : sales) {
            if (sale < averageSale) {
                monthsLower++;
            }

        }
        return monthsLower;

    }

    public int monthsHigherAverage(long[] sales) {
        int monthsHigher = 0;
        long averageSale = sum(sales) / sales.length;
        for (long sale : sales) {
            if (sale > averageSale) {
                monthsHigher++;
            }

        }
        return monthsHigher;

    }

}


