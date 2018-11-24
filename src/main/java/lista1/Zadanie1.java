package lista1;

import java.util.Scanner;

public class Zadanie1 {

    private static double parameterA;
    private static double parameterB;
    private static double result;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Równanie liniowe ma postać ax + b = 0");
        System.out.println("Wprowadź współczynnik \"a\" równania liniowego:");
        parameterA = in.nextDouble();
        System.out.println("Wprowadź współczynnik \"b\" równania liniowego:");
        parameterB = in.nextDouble();
        result = -parameterB / parameterA;

        System.out.println("Rozwiązaniem równania liniowego jest x = " + result);
    }
}
