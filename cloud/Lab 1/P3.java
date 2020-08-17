import java.util.Scanner;
//one of the worst codes ive written in my life
public class P3 {
    public static void main( String[] args ) {
        Scanner start = new Scanner(System.in);
        Scanner end = new Scanner(System.in);
        Scanner increment = new Scanner(System.in);
        System.out.println("starting: ");
        int userStart = start.nextInt();
        System.out.println("ending: ");
        int userEnd = end.nextInt();
        System.out.println("increment: ");
        int userIncrement = increment.nextInt();
        if (userEnd < userStart){
            System.out.println("Error input!!");
            System.exit(1); //help is this right
        }
        System.out.println("US$       S$");
        System.out.println("------------");
        int userStartDoWhileLoop = userStart;
        for (int i = userStart; i <= userEnd; i = i + userIncrement) {
            double singDollar = i*1.82;
            System.out.printf("%d        %.2f\n", i, singDollar);
        }
        System.out.println("US$       S$");
        System.out.println("------------");
        while (userStart <= userEnd){
            double singDollar = userStart*1.82;
            System.out.printf("%d        %.2f\n", userStart, singDollar);
            userStart += userIncrement;
        }
        System.out.println("US$       S$");
        System.out.println("------------");
        do {
            double singDollar = userStartDoWhileLoop * 1.82;
            System.out.printf("%d        %.2f\n", userStartDoWhileLoop, singDollar);
            userStartDoWhileLoop += userIncrement;
        }
        while (userStartDoWhileLoop <= userEnd);
        }

}
