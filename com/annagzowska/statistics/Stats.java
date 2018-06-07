package com.annagzowska.statistics;

/**
 * Created by anna on 10/20/16.
 */
public class Stats {
    private int count;
    private int sum;
    private int average;
    private int min;
    private int max;

    public Stats(int count, int sum, int average, int min, int max) {
        this.count = count;
        this.sum = sum;
        this.average = average;
        this.min = min;
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
