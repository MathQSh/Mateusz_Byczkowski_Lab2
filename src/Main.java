import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int x = scan.nextInt();
        switch (x % 2) {
            case 0 -> System.out.println("Parzysta");
            default -> System.out.println("Nieparzysta");
        }
    }
}