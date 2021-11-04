package com.company;

public class MyCounter3 {

    public double count(double... args) {
        if (!check(args)) {
            System.out.println("Illegal arguments");
            return Double.NaN;
        }
        return (3 * args[0] / Math.cos(args[0])) + Math.sqrt(Math.tanh(Math.abs(args[1])) * args[2]) / Math.log10(args[3]);
    }

    public boolean check(double... args) {
        if (args == null) {
            return false;
        }
        if (args.length != 4) {
            return false;
        }
        return
                Math.cos(args[0]) < 1;
    }
}
