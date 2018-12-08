package zadaniaNaZajeciach;

import java.util.Scanner;

public class Zadanie1 {

    public static double wb(double a) {
        return (a < 0 ? -a : a);
    }

    public static void main(String[] args) {

        System.err.print("Podaj liczbę rzeczywistą: ");
        Scanner in = new Scanner(System.in);
        System.out.println();
        double x = in.nextDouble();
        double y = wb(x);

        System.out.println(String.format("|%.3f| = %.3f", x, y));
    }
}
