public class Main {
    public static void main(String[] args) {
        metoda2(metoda1(20));


    }
    public static int[] metoda1(int zmienna){
        int[] tab = new int[zmienna];
        for (int i=0; i<zmienna; i++){
            tab[i] = 40-i;
        }

        return tab;
    }
    public static void metoda2(int[] tablica){
        for (int j : tablica) {
            System.out.println(j);
        }
    }

}
