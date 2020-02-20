package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {

                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Oh no! Something went wrong!" + e);
        } finally {
            System.out.println("If you incorrectly set divider into 0. I will return 0");
        }

        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}