public class Main {
    public static void main(String[] args) {
        int x = method1(1,2);
        int y = method1(7,8,9);
        //Pozwolilem sobie uzyc zmiennych poniewaz w przykladzie zadania ich nie wykorzystujemy..
        System.out.println("wynik: "+ (x + y));
    }
    public static Integer method1(Integer vrA, Integer vrB){
        return vrA + vrB;
    }
    public static Integer method1(Integer vrA , Integer vrB , Integer vrC){
        return vrA + vrB + vrC;
    }
}


