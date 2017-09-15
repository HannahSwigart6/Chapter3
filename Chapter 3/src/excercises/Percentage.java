package excercises;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
 double NumberOne, NumberTwo;
 float Percentage, Percentage2;
 
 System.out.println("Enter in a number >>");
 NumberOne = input.nextDouble();
 
 System.out.println("Enter in another number >>");
 NumberTwo = input.nextDouble();
 
 Percentage = (float)((NumberOne * 100) / NumberTwo);
 Percentage2 = (float)((NumberTwo * 100) / NumberOne);
 
 System.out.println(NumberOne+ " is " + Percentage+ "% of " +NumberTwo);
 System.out.println(NumberTwo+ " is " + Percentage2+ "% of " +NumberOne);
	}

}
