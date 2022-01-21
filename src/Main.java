import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0;i<5;i++){
            numbers[i] = in.nextInt()+11;
        }

        Arrays.stream(numbers, 0, 5).forEach(System.out::println);
    }
}