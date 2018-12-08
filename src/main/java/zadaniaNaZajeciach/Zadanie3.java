package zadaniaNaZajeciach;

import java.util.Scanner;

public class Zadanie3 {

    public static double x;
    public static int y;
    public static double a;
    public static double b;
    public static double c;

    public static int mySignum(double x) {
        if (x == 0) {
            y = 0;
        } else if (x < 0) {
            y = -1;
        } else
            y = 1;
        return y;
    }

    public static void mySignumDelta(double a, double b, double c) {

        double delta = (b * b) - (4 * a * c);
        int signum = mySignum(delta);
        System.out.println("signum wynosi: " + y);

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

        Scanner in = new Scanner(System.in);
        //System.err.print("wprowadź x: ");
        System.err.print("wprowadź a: ");
        a = in.nextDouble();
        System.err.print("wprowadź b: ");
        b = in.nextDouble();
        System.err.print("wprowadź c: ");
        c = in.nextDouble();
        //mySignum(x);

        mySignumDelta(a, b, c);
//        System.out.println("signum x wynosi: " + y);
    }
}


