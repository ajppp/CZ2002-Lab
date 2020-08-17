import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner height = new Scanner(System.in);
        System.out.println("height = ");
        int userHeight = height.nextInt();
        if (userHeight <=0){
            System.out.println("Error input!!");
            System.exit(1);
        }
        for (int i = 0; i < userHeight; i++){
            for (int j = 0; j<= i; j++){
                if (i % 2 ==0) {
                    if (j % 2 == 0) {
                        System.out.printf("AA");
                    } else {
                        System.out.printf("BB");
                    }
                }
                else{
                    if (j % 2 == 0) {
                        System.out.printf("BB");
                    } else {
                        System.out.printf("AA");
                    }

                }
            }
            System.out.println("\n");
        }
    }
}