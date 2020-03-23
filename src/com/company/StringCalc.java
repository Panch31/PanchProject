package com.company;

import java.util.Scanner;

public class StringCalc implements Calc {

    Scanner scan = new Scanner(System.in);
    String s;
    String operation;

    @Override
    public String getOperation() {
        System.out.print("Введите выражение");
        s = scan.nextLine();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case '+':
                    operation = "\\+";
                    break;
                case '-':
                    operation = "\\-";
                    break;
                case '*':
                    operation = "\\*";
                    break;
                case '/':
                    operation = "\\/";
                    break;
            }

        }
        return operation;
    }

    @Override
    public int getFirstInt() {
        String[]output = s.split(operation);
        String GetNum1 = output[0];
        int num1 = Integer.parseInt(GetNum1);
        return num1;
    }

    @Override
    public int getSecondInt() {
        String[]output = s.split(operation);
        String GetNum2 = output[1];
        int num2 = Integer.parseInt(GetNum2);
        return num2;
    }

    @Override
    public int math(int num1, int num2, String operation) {
        int result;
        switch (operation) {
            case "\\+":
                result = num1 + num2;
                break;
            case "\\-":
                result = num1 - num2;
                break;
            case "\\*":
                result = num1 * num2;
                break;
            case "\\/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана.");
                result = math(num1, num2, getOperation());
        }
        return result;
    }
}
