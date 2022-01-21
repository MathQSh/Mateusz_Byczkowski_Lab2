public class Main {
    public static void main(String[] args) {
        System.out.println("Pętla Continue");

        for (int i =0; i<=10; i++){
            if(i%3==0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Pętla BREAK");
        for (int i=0; i<=100; i++)
        {
            if (i==22)
                break;
            System.out.print(i + " ");

        }
        System.out.println(" ");
        System.out.println("Pętla Return");
        for (int i=0; i<=100; i++)
        {
            if(i==33)
                return;
            System.out.print(i + " ");
        }

    }
}
