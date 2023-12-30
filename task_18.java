//Accept   a number from user  and do sum of digit
package task;
import java.util.*;
public class task_18 {

	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number");
     int a=sc.nextInt();
     sumdigi(a);
     
		
     
	}
	public static void sumdigi(int no) {
		int sum=0;
		int r;
		
		while(no!=0)
		{
		 r=no%10;
		 sum=sum+r;
		 no=no/10;
		}
		System.out.print("Sum of digit is "+sum);
	}

}
