package task2;

public class Main {
    public static void main(String[] args) {
        int people = 10000000;
        int rozd = 14;
        int dead = 8;
        int year = 10;
        double minRozd = 7;
        double minDead = 6;

        for (int i = 1; i <= year; i++) {
            rozd = Math.max(minRozd, rozd - 1);
            dead = Math.max(minDead, dead - 1);

            int rozdR = (int) (people * rozd / 1000);
            int deadR = (int) (people * dead / 1000);

            people = people + rozdR - deadR;
        }

        System.out.println(people);
    }
}