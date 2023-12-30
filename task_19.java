//Accept   a number from user  and reverse it
package task;
import java.util.*;
public class task_19 {

	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number");
     int a=sc.nextInt();
     reverse(a);
     
		
     
	}
	public static void reverse(int no) {
		int x=0;
		int r;
		
		while(no!=0)
		{
		 r=no%10;
		 x=x*10+r;
		 no=no/10;
		}
		System.out.print("Reverse of number is "+x);
	}

}