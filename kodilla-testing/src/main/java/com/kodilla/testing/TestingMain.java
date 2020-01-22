package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        // test klasy simpleUser
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test user OK");
        } else {
            System.out.println("Error!");
        }

        // test klasy Calculator - 1.dodawanie
        Calculator calculator = new Calculator();
        Integer result2 = calculator.add(2, 5);
        if (result2.equals(7)) {
            System.out.println("Dodawanie OK");
        } else {
            System.out.println("Dodawanie Error!");
        }

        // test klasy Calculator - 2.odejmowanie
        Calculator calculator2 = new Calculator();
        Integer result3 = calculator2.subtract(2, 5);
        if (result3.equals(-3)) {
            System.out.println("Odejmowanie OK");
        } else {
            System.out.println("Odejmowanie Error!");
        }

    }
}