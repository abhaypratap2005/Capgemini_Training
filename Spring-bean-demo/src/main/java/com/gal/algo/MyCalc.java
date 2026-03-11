package com.gal.algo;

public class MyCalc implements Calc {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "MyCalc{}";
    }
}
