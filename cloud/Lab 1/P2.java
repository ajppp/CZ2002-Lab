import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        String a = new String();
        Scanner sc = new Scanner(System.in);
        System.out.printf("salary: $");
        int userSalary = sc.nextInt();
        System.out.printf("merit: ");
        int userMerit = sc.nextInt();
        if (userSalary < 600 && userSalary > 499){
            a = "Grade C";
        }
        else if (userSalary > 599 && userSalary < 650){
            if (userMerit < 10)
                a = "Grade C";
            else
                a = "Grade B";
        }
        else if (userSalary > 700 && userSalary < 799){
            if (userMerit < 20)
                a = "Grade B";
            else
                a = "Grade A";
        }
        else if (userSalary > 799)
            a = "Grade A";
    System.out.println(a);
    sc.close();
    }

}
