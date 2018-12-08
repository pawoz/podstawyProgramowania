package zadaniaNaZajeciach;

public class Data {

    private int rok;
    private int miesiac;
    private int dzien;
    private static String[] miesiace = {"", "stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "września", "października", "listopada", "grudnia"};
    private static int[][] dni = {

            {
                    0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            },

            {
                    0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            }
    };

    private static String[] dzienTygodnia = {"niedziela", "poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota"};

    public Data(int rok, int miesiac, int dzien) throws IllegalAccessException {
        if (rok < 1) throw new IllegalAccessException("rok spoza zakresu");
        if (miesiac < 1 || miesiac > 12) throw new IllegalAccessException("miesiąc spoza zakresu");
        if (dzien < 1 || dzien > dni[przestepny(rok)][miesiac]) throw new IllegalAccessException("dzień spoza zakresu");

        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }

    public static int ileDni(Data d) {
        int r = d.rok - 1;
        int suma = 365 * r + r / 4 - r / 100 + r / 400;
        for (int i = 1; i < d.miesiac; i++)
            suma += dni[przestepny(d.rok)][i];
        suma += d.dzien;

        return suma;
    }

    private static int przestepny(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? 1 : 0;
    }

    public String toString() {
        return String.format("%s %d %s %d", dzienTygodnia[ileDni(this) % 7], dzien, miesiace[miesiac], rok);
    }

    public static void main(String[] args) throws IllegalAccessException {

        Data d = new Data(2018, 12, 8);
        System.out.println(d);
    }
}