import java.util.*;

public class P2{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        //get salary and merit
        System.out.println("salary:");
        int salary = in.nextInt();
        System.out.println("merit");
        int merit = in.nextInt();

        //print output
        if (salary < 600){
            System.out.println("Grade C");
            return;
        }
        else if (salary < 649){
            if (merit < 10)
                System.out.println("Grade C");
            else
                System.out.println("Grade B");
            return;
        } 
        else if (salary > 650 && salary < 700){
            System.out.println("Grade B");
            return;
        }        
        else if (salary < 799){
            if (merit < 20)
                System.out.println("Grade B");
            else
                System.out.println("Grade A");
            return;
        }
        else
            System.out.println("Grade A");

        in.close();
    }
}
