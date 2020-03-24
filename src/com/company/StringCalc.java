package com.company;

import java.util.Scanner;

public class StringCalc implements Calc {

    private int num1;
    private int num2;
    private int result;
    private String s;
    private String operation;

    private void split(String operation){
        String[]output = s.split(operation);
        String GetNum1 = output[0];
        String GetNum2 = output[1];
        num1 = Integer.parseInt(GetNum1);
        num2 = Integer.parseInt(GetNum2);
    }
    public int GetOperation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение");
        s = scan.next();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case '+':
                    operation = "\\+";
                    split(operation);
                    System.out.println("Результат операции "+ sum(num1, num2));
                    break;
                case '-':
                    operation = "\\-";
                    split(operation);
                    System.out.println("Результат операции "+ dev(num1, num2));
                    break;
                case '*':
                    operation = "\\*";
                    split(operation);
                    System.out.println("Результат операции "+ mult(num1, num2));
                    break;
                case '/':
                    operation = "\\/";
                    split(operation);
                    System.out.println("Результат операции "+ sub(num1, num2));
                    break;
            }

        }
        return result;
    }

    @Override
    public int sum(int a, int b) {
        result = a + b;
        return result;
    }

    @Override
    public int dev(int a, int b) {
        result = a - b;
        return result;
    }

    @Override
    public int sub(int a, int b) {
        result = a / b;
        return result;
    }

    @Override
    public int mult(int a, int b) {
        result = a * b;
        return result;
    }

}

