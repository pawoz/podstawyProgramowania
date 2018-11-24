package lista1;

import java.util.Scanner;

public class Zadanie3 {

    private static int numberC;
    private static int numberOfOnes;
    private static int numberOfTens;
    private static int numberOfHundreds;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowitą c:");
        numberC = in.nextInt();
        numberOfOnes = numberC / 1;
        numberOfTens = numberC / 10;
        numberOfHundreds = numberC / 100;
        System.out.println("Cyfra jedności wprowadzonej liczby całkowitej c wynosi " + numberOfOnes + ", a reszta wynosi " + numberC % 1);
        System.out.println("Cyfra dziesiątek wprowadzonej liczby całkowitej c wynosi " + numberOfTens + ", a reszta wynosi " + numberC % 10);
        System.out.println("Cyfra setek wprowadzonej liczby całkowitej c wynosi " + numberOfHundreds + ", a reszta wynosi " + numberC % 100);
    }
}
