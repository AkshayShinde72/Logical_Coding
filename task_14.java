/*Consider a triangle with three sides measuring a, b, and c units. A triangle is a right-angled triangle if
a 2 + b2 = c2

Allow a tolerance of 0.000001 in the comparison in the above case i.e
a2 + b2 = c2 +/- 0.000001

A triangle is an isosceles triangle if any two of its sides are equal.
A triangle is an equilateral triangle if all the three sides are equal.

Three values can be the dimensions of a triangle if and only if the sum of every pair of values isgreater than the third value. Otherwise, it is an invalid triangle.

Write a program that reads three real numbers and finds out whether they can be the sides of thetriangle and if they do, prints what type of triangle it is. Even though all equilateral triangles are isosceles, your program should classify an equilateral triangle to be an equilateral only. Similarly
isosceles right-angled triangles should be classified as right-angled and not isosceles. A valid trianglewhich does not belong to any of the special types belongs to the notspecial category.
The three sides will be given as real numbers separated by blanks. The program should print the typeof the triangle in words using lower case letters followed by eoln without any blanks.
Thus the possible answers are
invalid
right-angled
isosceles
equilateral
notspecial
*/


package task;
import java.util.*;

public class task_14 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		System.out.print("Enter sides of the triangle");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int c=Sc.nextInt();
		int as=a*a;
		int bs=b*b;
		int cs=c*c;
		int sum1=as+bs;
		int sum2=bs+cs;
		int sum3=cs+as;
		
		if(a>b+c || b>a+c || c>a+b)
			System.out.print("invalid");
	
		else if(a==b && b==c)
			System.out.print("equilateral triangle");
				
			else if(a==b || b==c || a==c)
				{
				 if(as==sum2 ||  bs==sum3 || cs==sum1)		   
					System.out.print("Isosceles right angeled triangle");
				 else
					 System.out.print("Isosceles triangle");
					
				   
				}
			else if(as==sum2 ||  bs==sum3 || cs==sum1)
				System.out.print("right angeled triangle");
			
		
			
			

	}

}
