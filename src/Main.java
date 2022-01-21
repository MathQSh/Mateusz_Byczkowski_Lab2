import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        metoda2(metoda1());
    }

    public static String[] metoda1()
    {
        String[] tab= new String[6];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<6; i++){
            System.out.println("Podaj String wartosc "+i+" w tablicy");
            tab[i] = input.nextLine();
        }
        return tab;
    }
    public static void metoda2(String[] tablica){
        for (int i=5; i>=0; i--){
            System.out.print(tablica[i]+" ");
        }
    }
}
