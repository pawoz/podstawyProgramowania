package zadaniaNaZajeciach;

import java.util.Scanner;

public class Zadanie2 {

    public static int year;

    public static void calculate(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Podany rok jest przestępny");
        } else
            System.out.println("Podany rok nie jest przestępny");
    }

    public static void main(String[] args) {

        System.err.print("Podaj rok: ");
        Scanner in = new Scanner(System.in);
        System.out.println();
        year = in.nextInt();
        calculate(year);
    }
}