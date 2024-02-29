package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        while (true) {
            System.out.println("Введите первое число:");
            double num1 = text.nextDouble();

            System.out.println("Введите второе число:");
            double num2 = text.nextDouble();

            double result = num1 * num2;
            System.out.println("Результат умножения: " + result);

            System.out.println("Хотите завершить выполнени? Введи 1 для выхода или же любое другое число чтобы дальше идти).");
            int c = text.nextInt();

            if (c == 1) {
                System.out.println("Программа завершена.");
                break;
            }
        }

    }
}