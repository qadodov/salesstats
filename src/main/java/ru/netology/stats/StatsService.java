package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAvg(int[] sales) {
        int months = 0;
        for (int sale : sales) {
            if (sale < averageSum(sales)) {
                months = months + 1;
            }
        }
        return months;
    }

    public int aboveAvg(int[] sales) {
        int months = 0;
        for (int sale : sales) {
            if (sale > averageSum(sales)) {
                months = months + 1;
            }
        }
        return months;
    }

}


