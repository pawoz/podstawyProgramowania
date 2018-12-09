package lista2;

import java.util.Scanner;

public class Zadanie4 {
    static int n;

    public static void wprowadzN() {
        Scanner in = new Scanner(System.in);
        System.err.print("wprowadź n: ");
        n = in.nextInt();
    }

    public static int obliczLiczbeLucasa(int k) {
        if (k == 0)
            return 2;
        else if (k == 1)
            return 1;
        else
            return obliczLiczbeLucasa((k - 1)) + obliczLiczbeLucasa((k - 2));
    }

    private static void wypiszLiczbeLucasa() {
        System.out.println(obliczLiczbeLucasa(n));
    }

    public static void main(String[] args) {
        wprowadzN();
        obliczLiczbeLucasa(n);
        wypiszLiczbeLucasa();
    }
}