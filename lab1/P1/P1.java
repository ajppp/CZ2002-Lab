import java.util.*;

public class P1{
    public static void main(String[] args){

        System.out.println("Hi, insert a character");
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);

        switch(c){
            case 'a':
            case 'A':
                System.out.println("Action movie fan");
                break;

            case 'b':
            case 'B':
                System.out.println("Comedy movie fan");
                break;

            case 'c':
            case 'C':
                System.out.println("Drama movie fan");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        in.close();
    }
}
