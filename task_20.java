//Accept a number from user and check if it is palindrome number or not eg (121)
package task;
import java.util.*;
public class task_20 {

	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number");
     int a=sc.nextInt();
     ispalindrome(a);
     
		
     
	}
	public static void ispalindrome(int no) {
		int x=0;
		int r;
		int n=no;
		
		while(no!=0)
		{
		 r=no%10;
		 x=x*10+r;
		 no=no/10;
		}
		if(n==x)
		System.out.print("Entered number is palindrome");
		else
		System.out.print("Entered number is not a palindrome");
	}

}