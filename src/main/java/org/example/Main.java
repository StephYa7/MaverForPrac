package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

public class Main {
    public static void main(String[] args) {
        double[] num2 = {2.2, 4.2, 24.3};
        DescriptiveStatistics stat = new DescriptiveStatistics(num2);

        double max = stat.getMax();
        double min = stat.getMin();
        double sum = stat.getSum();
        double average = stat.getMean();

        System.out.println("Max:" + max + " min:" + min + " sum:" + sum + " average:" + average);

        var fac = ArithmeticUtils.factorial(10);
        var gcd = ArithmeticUtils.gcd(10, 12);
        var lcm = ArithmeticUtils.gcd(10, 12);
        var isPowerOfTwo = ArithmeticUtils.isPowerOfTwo(32);

        System.out.println("fac:" + fac + " gcd:" + gcd + " lcm:" + lcm + " isPowerOfTwo:" + isPowerOfTwo);


    }
}