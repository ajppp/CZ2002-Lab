import java.util.Scanner;
//one of the worst codes ive written in my life
public class P3 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("starting: ");
        int userStart = sc.nextInt();
        System.out.printf("ending: ");
        int userEnd = sc.nextInt();
        System.out.printf("increment: ");
        int userIncrement = sc.nextInt();
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
        System.out.println("\nUS$       S$");
        System.out.println("------------");
        while (userStart <= userEnd){
            double singDollar = userStart*1.82;
            System.out.printf("%d        %.2f\n", userStart, singDollar);
            userStart += userIncrement;
        }
        System.out.println("\nUS$       S$");
        System.out.println("------------");
        do {
            double singDollar = userStartDoWhileLoop * 1.82;
            System.out.printf("%d        %.2f\n", userStartDoWhileLoop, singDollar);
            userStartDoWhileLoop += userIncrement;
        }
        while (userStartDoWhileLoop <= userEnd);
        }

}
