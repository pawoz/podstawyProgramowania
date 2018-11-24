package lista1;

import java.util.Scanner;

public class Zadanie2 {

    private static double numberA;
    private static double numberB;
    private static double sumResult;
    private static double substractResult;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj sumę liczb rzeczywistych a i b:");
        sumResult = in.nextDouble();
        System.out.println("Podaj różnicę liczb rzeczywistych a i b:");
        substractResult = in.nextDouble();

        numberA = (sumResult + substractResult) / 2;
        numberB = (sumResult - substractResult) / 2;

        System.out.println("Liczba rzeczywista a wynosi " + numberA);
        System.out.println("Liczba rzeczywista b wynosi " + numberB);
    }
}
