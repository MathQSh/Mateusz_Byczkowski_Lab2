public class Main {
    public static void main(String[] args) {
        method1("Mateusz");
        method1("Mateusz", "Byczkowski" );
        method1("Mateusz", "Byczkowski" , 21);
    }
    public static void method1(String name){
        System.out.println(name);
    }
    public static void method1(String name, String surname){
        System.out.println(name + " " + surname);
    }
    public static void method1(String name, String surname, Integer age){
        System.out.println(name + " " + surname + " " + age);
    }

}
