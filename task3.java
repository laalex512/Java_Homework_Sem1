// Реализовать простой калькулятор

package Homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        double a, b;
        String operation;
        double result = 0;
        Scanner iScan = new Scanner(System.in);
        System.out.printf("Insert a: ");
        a = iScan.nextDouble();
        System.out.printf("Insert operation: ");
        operation = iScan.next();
        System.out.printf("Insert b: ");
        b = iScan.nextDouble();
        iScan.close();
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
        }
        System.out.printf("%.2f %s %.2f = %.2f", a, operation, b, result);
    }
}
