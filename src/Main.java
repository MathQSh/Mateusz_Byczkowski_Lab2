import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int x = scan.nextInt();
        switch (x % 2) {
            case 0 -> System.out.println("Liczba " + x + " jest parzysta");
            default -> System.out.println("Liczba " + x + " jest nieparzysta");
        }
        switch (x % 7){
            case 0 -> System.out.println("Liczba " + x + " jest podzielna przez 7");
            case 1 -> System.out.println("Liczba " + x + " jest niepodzielna przez 7");
        }
    }
}