import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();

        AddToSetList(set1);
        Iterator(set1);
    }
    public static void AddToSetList(Set<Integer> set) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<10; i++){
            set.add(input.nextInt());
        }
    }
    public static void Iterator(Set<Integer> set ) {
        for (Integer i : set) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

