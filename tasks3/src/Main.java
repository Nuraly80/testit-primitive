package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float deposit = text.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int months = text.nextInt();
        for (int i = 1; i <= months; i++) {
            deposit += deposit * 0.07;
        }
        System.out.println("После " + months + " месяцев сумма вклада составит: " + deposit);
    }
}