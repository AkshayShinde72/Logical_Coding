/*
 Accept years of investment rate of interest and principal amount 
 of investment find simple interest
 */

package task;
import java.util.*;

public class task_12 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		int year,amount,rate,SI;
		System.out.print("Enter rate of intrest");
		rate=Sc.nextInt();
		System.out.println("Enter principal of amount");
		amount=Sc.nextInt();
		System.out.println("Enter no of year");
		year=Sc.nextInt();
		
		
		SI=(rate*year*amount)/100;
		System.out.print("Simple intrest is" +SI);
		
		

	}

}
