package com.company;

public class MyCounter2 {

    public double count(double... args) {
        if (!check(args)) {
            System.out.println("Illegal arguments");
            return Double.NaN;
        }
        return 2 * Math.log(Math.pow(args[1], args[0])) + Math.abs(Math.asin(-Math.sqrt(args[3] / args[2])));
    }

    public boolean check(double... args) {
        if (args == null) {
            return false;
        }
        if (args.length != 4) {
            return false;
        }
        return Math.abs(-Math.sqrt(args[3] / args[2])) < 1;
    }
}
