/*
package com.company;

import java.util.Scanner;

public class IntCalc implements Calc {

    Scanner scan = new Scanner(System.in);

    @Override
    public String getOperation() {
        System.out.println("Введите операцию:");
        String operation = scan.next();
        return operation;
    }

    @Override
    public int getFirstInt() {
        System.out.println("Введите первое число");
        int num1 = scan.nextInt();
        return num1;
    }

    @Override
    public int getSecondInt() {
        System.out.println("Введите второе число");
        int num2 = scan.nextInt();
        return num2;
    }

    @Override
    public int math(int num1, int num2, String operation) {
        int result;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                result = math(num1, num2, getOperation());
        }
        return result;
    }
}

*/
