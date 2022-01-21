public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 26;
        for (int i = 0; i <= 100; i++) {
            if (i % x == 0)
            {
                System.out.println(i);
            }
            else if(i==0)
            {
                System.out.println(i%y);
            }
        }
    }
}