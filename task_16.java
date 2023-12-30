//Accept a number from user and find a factorial of a number
package task;
import java.util.*;

public class task_16 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter a number");
		
		int no=Sc.nextInt();
		factorial(no);
		
	}
	public static void factorial(int x) {
		int i,fact=1;
		for(i=1;i<=x;i++)
			fact=fact*i;
		System.out.print(fact);
		
	}

}
