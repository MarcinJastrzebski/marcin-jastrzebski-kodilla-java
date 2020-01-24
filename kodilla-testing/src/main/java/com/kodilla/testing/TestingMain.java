package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumberExterminator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        System.out.println(lista);
        System.out.println(OddNumberExterminator.exterminate(lista));

    }
}