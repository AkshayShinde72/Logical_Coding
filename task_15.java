//Accept 10 number user and do sum of it.(do not use array)

package task;
import java.util.*;
public class task_15 {

	public static void main(String[] args) {
		sum(10);	
	}	
	public static void sum(int x) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter 10 numbers");
		int i,a,sum=0;
		for(i=1;i<=x;i++)
		{
			a=Sc.nextInt();
			sum=sum+a;
			
		}
		System.out.print("Sum of 10 number is "+sum);

	}

}
