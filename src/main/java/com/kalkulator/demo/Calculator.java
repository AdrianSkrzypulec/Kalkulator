package com.kalkulator.demo;

public class Calculator {

    public int sumAToB (int a, int b) {
        return a + b;
    }
    public int substractBFromA (int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int resultSum = calculator.sumAToB(1, 2);
        int resultSubstrate = calculator.substractBFromA(2, 1);
        System.out.println(resultSum + ", "  + "" + resultSubstrate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}





