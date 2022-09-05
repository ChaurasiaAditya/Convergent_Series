/*
 * Author Name: Aditya Chaurasia
 * Date: 05-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class ConvergentSeries {
    public static void main(String[] args) {

    }
    /**
     * This method finds the sum of the series of numbers.
     *
     * @param number the number to find the sum of the series.
     * @return the sum of the series.
     */
    public double calculateSumOfSeries(double number) {
        double sum = 0.0;
        for (int i = 2; i <= number; i++) {
            double a = (1/Math.pow(2,i));
            sum += a;
        }
        if (number>0)return sum + 1.0 + 0.5;
        else return 0.0;
    }

}
