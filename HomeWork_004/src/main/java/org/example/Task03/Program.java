package org.example.Task03;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        Calc calc3 = new Calc();
        double result1 = calc3.sum(new ArrayList<>(Arrays.asList(2, 3)));
        double result2 = calc3.multiply(new ArrayList<>(Arrays.asList(2.3, 3.5)));
        double result3 = calc3.division(new ArrayList<>(Arrays.asList(2.3, 3.5)));
        System.out.println("Result суммы: " + String.format("%.1f", result1));
        System.out.println("Result умножения: " + String.format("%.1f", result2));
        System.out.println("Result деления: " + String.format("%.1f", result3));
        System.out.println("Result в бинарной системе счисления: " + Integer.toBinaryString((int) result1));
    }
}
