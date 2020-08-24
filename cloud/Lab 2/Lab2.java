import java.util.*;
import java.math.*;
public class Lab2 {
 	public static void main(String[] args){
	int choice;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Perform the following methods:");
		System.out.println("1: miltiplication test");
		System.out.println("2: quotient using division by subtraction");
		System.out.println("3: remainder using division by subtraction");
		System.out.println("4: count the number of digits");
		System.out.println("5: position of a digit");
		System.out.println("6: extract all odd digits");
		System.out.println("7: quit");
		choice = sc.nextInt();
		switch (choice) {
			case 1: 
				mulTest();
			 	break;
			case 2: 
				int m, n;
				System.out.printf("m = ");
				m = sc.nextInt();
				System.out.printf("n = ");
				n = sc.nextInt();
				System.out.printf("%d/%d=%d\n",m,n,divide(m,n));
			 	break;
			case 3:
				System.out.printf("m = ");
				m = sc.nextInt();
				System.out.printf("n = ");
				n = sc.nextInt();
				System.out.println(Integer.toString(m) +'%'+ Integer.toString(n) +'='+ Integer.toString(modulus(m,n)));
			 	break;
			case 4:
				System.out.println("n : "); 
				n = sc.nextInt();
				countDigits(n);
				if (n<0)
					System.out.println("Error input!!");
				else 
					System.out.printf("count = %d \n", countDigits(n));
			 	break;
			case 5: 
				int digit;
				System.out.printf("n : ");
				n = sc.nextInt();
				System.out.printf("digit : ");
				digit = sc.nextInt();
				System.out.printf("position = %d \n", position(n,digit));
			 	break;
			case 6: 
				System.out.printf("n : "); 
				n = sc.nextInt();
				if (n<0)
					System.out.println("Error input!!");
				else 
					System.out.printf("OddDigits = %d\n", extractOddDigits(n));
			 	break;
			case 7: System.out.println("Program terminating ...");
			}
		} 
	while (choice < 7);
	}
public static void mulTest(){
	int count = 0;
	for (int i=0; i<5; i++){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		System.out.printf("How much is %d times %d ?\n", x, y);
		int user_input = sc.nextInt();
		if (user_input == x*y)
			count += 1;
	}
	System.out.println(count + " answers out of 5 are correct.");
}
public static int divide(int m, int n){
	int answer = 0;
	if (m<n)
		answer = 0;
	if (m==n)
		answer = 1;
	while (n<m && m>0){
		answer += 1;
		m-=n;
	}
	return answer;
}
public static int modulus(int m, int n){
	int answer = m;
	if (m<n)
		answer = m;
	if (m==n)
		answer = 0;
	while (n<answer && answer>0){
		answer -= n;
	}
	return answer;
}
public static int countDigits(int n){
	int count = 0;
	while (n>0){
		n=n/10;
		count+=1;
	}
	return count;
}
public static int position(int n, int digit){
	int count = 1;
	while (n>0){
		if (digit!= n%10){
			n=n/10;
			count+=1;
		}
		else
			return count;
	}
	return count = -1;
}
public static long extractOddDigits(long n){
	int count = 0;
	int i = 10;
	while (n>0){
		if ((n%10)%2==1){
			count+=(n%10)*(i/10);
			i*=10;
		}
		n=n/10;
	}
	if (count>0)
		return count;
	else
		return -1;
}
}


