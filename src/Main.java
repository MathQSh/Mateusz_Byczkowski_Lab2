public class Main {
    public static void main(String[] args) {
        String someString = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int length = someString.length();
        long count = someString.chars().filter(ch -> ch == 'o').count();
        long count2 = someString.codePoints().filter(ch -> ch == 'p').count();
        long count3 = someString.chars().filter(ch -> ch == 'z').count();
        long count4 = someString.chars().filter(ch -> ch == 'x').count();
        long count5 = someString.chars().filter(ch -> ch == 'q').count();
        System.out.println("Liter 'o' w danym wyrażeniu jest: "+count);
        System.out.println("Liter 'p' w danym wyrażeniu jest: "+count2);
        System.out.println("Liter 'z' w danym wyrażeniu jest: "+count3);
        System.out.println("Liter 'x' w danym wyrażeniu jest: "+count4);
        System.out.println("Liter 'q' w danym wyrażeniu jest: "+count5);
        System.out.println("Suma wszystkich wyszukiwanych Liter: "+(count+count2+count3+count4+count5));
        System.out.println("Suma pozostałych liter: "+(length-(count+count2+count3+count4+count5)));
    }
}