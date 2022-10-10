import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        read_in();
        checkpassfail();
        checkoddeven();
        printNumberinWord();
        printDayinWord();
    }

    static void read_in() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy számot!");
        Num = scanner.nextInt();
    }

    static int Num;

    static void checkpassfail() {

        if (Num >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        System.out.println("Done");
        System.out.println("Következő feladat 1.3");
    }

    static void checkoddeven() {

        int Number = 51;       // Set the value of "number" here!
        System.out.println("The number is " + Number);
        if (Number % 2 == 1) {
            System.out.println("odd number");
        } else {
            System.out.println("even number");
        }
        System.out.println("By!");
        System.out.println("Következő feladat 1.4");
    }

    static void printNumberinWord() {
        int number_a = 7;

        switch (number_a) {
            case 1:
                System.out.println("EGY");
                break;  // Don't forget the "break" after each case!
            case 2:
                System.out.println("KETTŐ");
                break;
            case 3:
                System.out.println("HÁROM");
                break;
            case 4:
                System.out.println("NÉGY");
                break;
            case 5:
                System.out.println("ÖT");
                break;
            case 6:
                System.out.println("HAT");
                break;
            case 7:
                System.out.println("HÉT");
                break;
            case 8:
                System.out.println("NYOLC");
                break;
            case 9:
                System.out.println("KILENC");
                break;
            case 10:
                System.out.println("TÍZ");
                break;
            default:
                System.out.println("NEM DEFINIÁLT ESET");
        }
        System.out.println("Következő feladat 1.5");

    static void printDayinWord() {

        int Number_b=6;

        switch (Number_b) {
            case 0:
                System.out.println("HÉTFŐ");
                break;
            case 1:
                System.out.println("KEDD");
                break;
            case 2:
                System.out.println("SZERDA");
                break;
            case 3:
                System.out.println("CSÜTÖRTÖK");
                break;
            case 4:
                System.out.println("PÉNTEK");
                break;
            case 5:
                System.out.println("SZOMBAT");
                break;
            case 6:
                System.out.println("VASÁRNAP");
                break;
            default:
                System.out.println("Hibás kód");
        }
    }
}}













