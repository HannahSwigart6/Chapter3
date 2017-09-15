package Debugging;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Debugging4 {

	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myCredits  ;
	      int yourCredits ;
	      double rate;
	    input = new Scanner(System.in);
	      
	      System.out.println("Enter in your your credits >>");
	      myCredits = input.nextInt();
	      
	      System.out.println("Enter in someone else credits >>");
	      yourCredits = input.nextInt();
	      
	      System.out.println("Enter in the rate >>");
	      rate = input.nextInt();
	      
	      System.out.println("My tuition:");
	      tuitionBill(myCredits, rate);
	     System.out.println("Your tuition:");
	     tuitionBill(yourCredits, rate);
	}
	public static void tuitionBill(int c, double r)
	  {
		DecimalFormat df = new DecimalFormat("0.00"); 
	      System.out.println("Total due " + (df.format(r*c)));
	   }
}
