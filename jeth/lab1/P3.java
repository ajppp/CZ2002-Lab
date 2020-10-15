import java.util.*;

class Converter{
    static final double US_EXCHANGERATE = 1.82;
    public void convertUS(double sgd){
        System.out.printf("%-10.2f%10.2f\n", sgd, US_EXCHANGERATE * sgd);
       //System.out.println(US_EXCHANGERATE * sgd);
    }
}

public class P3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 

        //Print out parameters 
        System.out.println("starting: ");
        int start = in.nextInt();

        System.out.println("ending: ");
        int end = in.nextInt();
       
        System.out.println("increment: ");
        int increment = in.nextInt();

        //check for error
        if(end < start){
            System.out.println("Error input!!");
            return;
        }

        Converter usd = new Converter();

        //first table - for loop

        System.out.printf("\n%-10s%10s\n", "$US", "$S");
        System.out.printf("%s\n", "--------------------");

        for(int i = start; i <= end; i += increment){
           usd.convertUS(i);
        }

        //second table - while loop
        System.out.printf("\n%-10s%10s\n", "$US", "$S");
        System.out.printf("%s\n", "--------------------");
        int j = start;
        while(j <= end){
            usd.convertUS(j);
            j += increment;
        }

        //third table - do-while loop
        System.out.printf("\n%-10s%10s\n", "$US", "$S");
        System.out.printf("%s\n", "--------------------");
        j = start;
        do{
            usd.convertUS(j);
            j += increment;
        } while (j <= end);
    }
}
