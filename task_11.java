/*Accept 3 digit number from user and do the sum of 
its digit .(do not use any loop)*/

package task;
import java.util.*;
public class task_11 {

	public static void main(String[] args) {
		System.out.print("Enter three digit number");
		int no,no1,no2,sum=0,r1,r2;
		Scanner sc=new Scanner(System.in);
		
		no=sc.nextInt();
		
		r1=no%10;
		sum=sum+r1;
		no1=no/10;
		
		r2=no1%10;
		sum=sum+r2;
		no2=no1/10;
		
		sum=sum+no2;
		
		System.out.println("Sum of digits is "+sum);
		
		
		
		

	}

}
