import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        String userInput = letter.nextLine();
        switch (userInput) {
            case "a":
            case "A":
                System.out.println("Action movie fan\n");
                break;

            case "c":
            case "C":
                System.out.println("Comedy movie fan\n");
                break;

            case "d":
            case "D":
                System.out.println("Drama movie fan\n");
                break;

            default:
                System.out.println("Invalid choice\n");

        }
    letter.close();
    }
}
