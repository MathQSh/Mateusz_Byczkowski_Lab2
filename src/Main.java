import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        AddArrayListFor(list1, 8);
        RemoveLastFromList(list1 , 2);
        ShowAllFromArrayOnConsole(list1);
        AddArrayListFor(list1, 3);
        System.out.println(list1.size());
        ReverseArray(list1);
        ShowAllFromArrayOnConsole(list1);
    }
    public static void ShowAllFromArrayOnConsole(List<String> l) {
        for(String s : l ){
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static void RemoveLastFromList(List<String> l , int howManyDelete) {
        for(int i=0; i<howManyDelete; i++) {
            l.remove((l.size())-1);
        }
    }
    public static void AddArrayListFor(List<String> l, int howManyAdd){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<howManyAdd; i++){
            l.add(input.nextLine());
        }
    }
    public static void ReverseArray(List<String> l){
        Collections.reverse(l);
    }

}