package Debugging;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class DebuggingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double myCheck;
	      double yourCheck;
	     
	      Scanner input = new Scanner(System.in);
	       
	      System.out.println("Enter in your check");
	      myCheck = input.nextDouble();
	      
	      System.out.println("Enter in the other persons check");
	      yourCheck = input.nextDouble();
	      
	      calcTip(myCheck);
	      calcTip(yourCheck);
	}
	
	
	 public static void calcTip(double bill) {
		 final double RATE = 0.15;
	      double tip;
	      tip = bill * RATE;
	      DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("The tip should be at least " + (df.format(tip))); 
	 }
}
