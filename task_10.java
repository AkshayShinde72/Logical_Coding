/*
 Enter sex m/f  and salary- if m-salary>8000 tax is 5% 
 of salary else 2%if f-salary>5000 tax is 3% else tax is 1% 
 find a net salary=salary-tax
  */
package task;
import java.util.*;

public class task_10{

	public static void main(String[] args){
		
	Scanner Sc=new Scanner(System.in);
	float tax;
	System.out.print("Enter Sex");
	char sex=Sc.next().charAt(0);
	System.out.print("Enter Salary");
	int sal=Sc.nextInt();
	
	if(sex=='m' && sal>8000)
	{ 
        tax=(float)(0.05*sal);	
        System.out.print(tax);
	}
	else if(sex=='m' && sal<=8000)
	{ 
        tax=(float)(0.02*sal);
        System.out.print(tax);
	}
	else if(sex=='f' && sal>=5000)
	{ 
        tax=(float)(0.03*sal);	
        System.out.print(tax);
	}
	else if(sex=='f' && sal<=5000)
	{ 
        tax=(float)(0.01*sal);	
        System.out.print(tax);
	}

	}

}
