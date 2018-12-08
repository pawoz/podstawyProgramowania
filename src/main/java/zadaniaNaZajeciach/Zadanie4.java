package zadaniaNaZajeciach;

import java.util.Scanner;

public class Zadanie4 {

    public static int year;
    public static int yearOfTheMonkey = 1900;
    public static String patron;

    public static void calculateAndSetPatron(int year) {

        switch ((year - yearOfTheMonkey) % 12) {
            case 0: {
                patron = "szczur";
                break;
            }
            case 1: {
                patron = "bawół";
                break;
            }
            case 2: {
                patron = "tygrys";
                break;
            }
            case 3: {
                patron = "królik";
                break;
            }
            case 4: {
                patron = "smok";
                break;
            }
            case 5: {
                patron = "wąż";
                break;
            }
            case 6: {
                patron = "koń";
                break;
            }
            case 7: {
                patron = "koza/owca";
                break;
            }
            case 8: {
                patron = "małpa";
                break;
            }
            case 9: {
                patron = "kogut";
                break;
            }
            case 10: {
                patron = "pies";
                break;
            }
            case 11: {
                patron = "świnia";
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.err.print("wprowadź rok:");
        year = in.nextInt();
        calculateAndSetPatron(year);
        System.out.println(patron);
    }
}
