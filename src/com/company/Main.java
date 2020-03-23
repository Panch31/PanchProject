package com.company;

public class Main {

    public static void main(String[] args) {
       /* IntCalc intcalc = new IntCalc();
        int a = intcalc.getFirstInt();
        String operation = intcalc.getOperation();
        int b = intcalc.getSecondInt();
        int result = intcalc.math(a, b, operation);
        System.out.println("Результат операции равен " + result);*/

        StringCalc stringCalc = new StringCalc();
        String operation = stringCalc.getOperation();
        int num1 = stringCalc.getFirstInt();
        int num2 = stringCalc.getSecondInt();
        int result = stringCalc.math(num1, num2, operation);
        System.out.println("Результат операции равен " + result);
    }
}
