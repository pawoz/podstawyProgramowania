package lista1;

import java.util.Scanner;

public class Zadanie4 {


    private static int numberOfSides;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe boków wielokąta foremnego (n > 2).");
        numberOfSides = in.nextInt();

        if (numberOfSides > 2) {
            System.out.format("Kąt pomiędzy bokami wielokąta foremnego wynosi " + "%.1f", (Math.toDegrees((numberOfSides - 2) * Math.PI / numberOfSides)));
        } else {
            System.out.println("Liczba n musi być > 2");
        }
    }
}
