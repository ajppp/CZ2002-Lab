import java.util.Scanner;
import java.math.*;

public class Lab2p1{
    public static void main(String[] args){

        int choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by substraction");
            System.out.println("3: remainder using division by substraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println("m =");
                    int m = sc.nextInt();
                    System.out.println("n =");
                    int n = sc.nextInt();

                    System.out.println(divide(m,n));
                    break;
                case 3:
                    System.out.println("m =");
                    m = sc.nextInt();
                    System.out.println("n =");
                    n = sc.nextInt();
                    System.out.println(modulus(m,n));
                    break;
                case 4:
                    System.out.println("n =");
                    n = sc.nextInt();
                    if(n < 0)
                        System.out.println("(give an error message)");
                    System.out.println(countDigits(n));
                    break;
                case 5:
                    System.out.println("n:");
                    int a = sc.nextInt();
                    System.out.println("digit =");
                    int digit = sc.nextInt();

                    System.out.println(position(a, digit));
                    break;
                case 6:
                    System.out.println("n =");
                    n = sc.nextInt();
                    if(n < 0)
                        System.out.println("(give an error message)");
                    System.out.println(extractOddDigits(n));
                    break;
                case 7: System.out.println("Program terminating....");
            }
        } while (choice < 7);
    }
    
    //add method code here
    
    //random single digit integer generator
    public static int getRandomInt(){
        return (int) ((Math.random() * 8) + 1);
    }
    //case 1 - multiplication test
    public static void mulTest(){
        int mul1, mul2;
        int correct = 0, result;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            mul1 = getRandomInt();
            mul2 = getRandomInt();
            System.out.printf("How much is %d times %d? \n", mul1, mul2);
            result = in.nextInt(); 
            if (result == mul1*mul2)
                correct++;
        }
        System.out.println(correct + " answers out of 5 are correct.");
    }

    //case 2 - division by substraction
    public static int divide(int m, int n){
        int result = 0;
        while(m >= n){
            m -= n;
            result ++;
        }
        return result;
    }

    //case 3 - remainder by substraction
    public static int modulus(int m, int n){
        while(m >= n){
            m -= n;
        }
        return m;
    }

    //case 4 - count number of digits
    public static int countDigits(int n){
        int count = 0;

        while (n > 0){
            n /= 10;
            count++;
        }

        return count;
    }

    //case 5 - returns the position of the first appearance of digit
    public static int position(int n, int digit){
        int count = 1 ;
        int remainder;

        while(n > 1){
            int lastDigit = (int) n % 10;
            if (lastDigit == digit){
                return count;
            }
            count++;
            n /= 10;
        }
        
        return -1;   
    }

    //case 6 - extracts the odd digits 
    public static long extractOddDigits(long n){
        int remainder;
        long result = 0;
        int count = 0;

        while(n > 0){

            remainder = (int) n % 10;
            //odd digits
            if (remainder % 2 == 1){
                for(int i = 0; i < count; i++){
                    remainder *= 10;
                }
                count++;
                result += remainder;
            }
            n /= 10;
        }

        if (result == 0){
            return -1;
        }

        return result;
    }
}
