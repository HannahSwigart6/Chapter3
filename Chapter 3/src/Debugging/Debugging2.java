package Debugging;
import java.util.Scanner;
public class Debugging2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a , b , c ;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter in a number >>");
		a = input.nextInt();
		
		System.out.println("Enter in a number >>");
		b = input.nextInt();
		
		System.out.println("Enter in another number >>");
		c = input.nextInt();
		
	      add(a, b);
	      add(b, c);
	      subtract(c, a);        
	}
	public static void add(int a, int  b)
	   {
	      System.out.println("The sum of " + a +
	         " and " + b + " is " + (a + b));
	   }
	   public static void subtract(int a, int b)
	   {
	      System.out.println("The difference between " +
	        a + " and " + b + " is " +  (a - b));
	   }
}
