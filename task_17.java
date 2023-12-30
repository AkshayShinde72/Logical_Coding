//Accept 10 number from user count how many are  positive ,negative , zero
package task;
import java.util.*;

public class task_17 {

	public static void main(String[] args) {
		
		type(10);

	}
	public static void type(int x) {
		System.out.print("Enter 10 numbers");
		Scanner sc=new Scanner(System.in);
		int i,no,p=0,n=0,z=0;
		for(i=1;i<=x;i++)
		{
		   no=sc.nextInt();
		   if(no<0)
				n++;
			else if(no>0)
				p++;
			else
				z++;
		}
		
		System.out.print("Positive no count "+p  );
		System.out.println("Negativetive no count "+n);
		System.out.println("Zero no count "+z);
			
	}

}
