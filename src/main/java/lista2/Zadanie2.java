package lista2;

import java.util.Scanner;

public class Zadanie2 {
    static int n;

    public static int silnia(int i) {
        if (i == 0)
            return 1;
        else
            return i * silnia(i - 1);
    }

    public static void wprowadzN() {
        Scanner in = new Scanner(System.in);
        System.err.print("wprowadź n: ");
        n = in.nextInt();
    }

    public static void drukujWynik() {
        int wynik = silnia(n);
        System.out.println(wynik);
    }

    public static void main(String[] args) {
        wprowadzN();
        drukujWynik();
    }
}
