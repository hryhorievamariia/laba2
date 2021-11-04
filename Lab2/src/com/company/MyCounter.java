package com.company;

public class MyCounter {

    public double count(double... args) {
        if (!check(args)) {
            System.out.println("Illegal arguments");
            return Double.NaN;
        }
        return 2 * Math.cos(Math.pow(args[0] , args[1])) + Math.abs(Math.acos(-Math.sqrt(args[2]) / args[3]))/4 ;
    }

    public boolean check(double... args) {
        if (args == null) {
            return false;
        }
        if (args.length != 4) {
            return false;
        }
        return Math.abs(Math.asin(-Math.sqrt(args[3] / args[2]))) < 1;
    }
}
