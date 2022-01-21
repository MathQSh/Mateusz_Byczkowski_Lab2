public class Main {
    public static void main(String[] args) {
        int i = 1000;
        int x = 26;
        while (i > 0){
            if (i%x==0)
                System.out.println("liczba "+ i + " podzielna przez "+ x);
            i--;

        }
    }
}

