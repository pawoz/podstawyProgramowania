package lista2;

import java.util.Scanner;

public class Zadanie3 {
    public static int n;
    public static int k;
    public static int wynik;

    public static void wprowadzWspolczynniki() {
        Scanner in = new Scanner(System.in);
        do {
            System.err.print("wprowadź nieujemny współczynnik n: ");
            n = in.nextInt();
            System.err.print("wprowadź nieujemny współczynnik k mniejszy od n: ");
            k = in.nextInt();
        } while (k > n || k == 0 || n == 0);
    }

    public static long silnia(int i) {
        if (i == 0)
            return 1;
        else
            return i * silnia(i - 1);
    }

    public static int obliczDwumian(int n, int k) {
        if (n == 0 && k == 0)
            return 1;
        else
            return (int) ((silnia(n) / (silnia(k) * silnia((n - k)))));
    }

    public static void drukujWynik() {
        System.out.println(obliczDwumian(n, k));
    }

    public static void main(String[] args) {
        wprowadzWspolczynniki();
        obliczDwumian(n, k);
        drukujWynik();
    }
}