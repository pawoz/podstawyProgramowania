package lista2;

import java.util.Scanner;

public class Zadanie1 {
    static double a;
    static double b;
    static double c;
    static double delta;
    static int signum;

    public static void wprowadzanieWspolczynnikow() {
        Scanner in = new Scanner(System.in);
        do {
            System.err.print("wprowadź a różne od 0: ");
            a = in.nextDouble();
        }
        while (a == 0);

        System.err.print("wprowadź b: ");
        b = in.nextDouble();
        System.err.print("wprowadź c: ");
        c = in.nextDouble();
    }

    public static int obliczSignum() {
        double delta = (b * b) - (4 * a * c);
        if (delta == 0)
            return signum = 0;
        else if (delta < 0)
            return signum = -1;
        else
            return signum = 1;
    }

    public static void obliczenieIWyswietlenieMiejscZerowych() {
        switch (signum) {
            case -1:
                System.out.println("brak miejsc zerowych");
                break;
            case 0:
                double x = -b / (2 * a);
                System.out.println("jedno miejsce zerowe x = " + x);
                break;
            case 1:
                double x1 = (-b + Math.sqrt(delta) / (2 * a));
                double x2 = (-b - Math.sqrt(delta) / (2 * a));
                System.out.println("dwa miejsca zerowe: x1 = " + x1 + ", x2 = " + x2);
                break;
        }
    }

    public static void main(String[] args) {
        wprowadzanieWspolczynnikow();
        obliczSignum();
        obliczenieIWyswietlenieMiejscZerowych();

    }
}

