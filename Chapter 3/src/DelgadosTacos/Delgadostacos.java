package DelgadosTacos;

import java.util.Scanner;

public class Delgadostacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		
		double taco = 1.99, riceAndBeans = 2.50, TacoSalad = 5.99, Horchata = 1.99, burritos = 5.99, MexicanPop = 1.99, chipsAndSalsa = 2.00;
		double tamales = 1.50, enchiladas = 1.00, fajita = 4.99;
		double tacoOrdered, riceAndBeansOrdered, TacoSaladOrdered, HorchataOrdered, burritosOrdered, MexicanPopOrdered, chipsAndSalsaOrdered,tamalesOrdered, enchiladasOrdered, fajitasOrdered;
		double tacoPrice, riceAndBeansPrice, TacoSaladPrice, HorchataPrice, burritosPrice, MexicanPopPrice, chipsAndSalsaPrice, tamalesPrice, enchaladasPrice, fajitasPrice;
		
		
		System.out.println("How many tacos would you like? >>");
		tacoOrdered = input.nextDouble();
		tacoPrice = tacoOrdered * taco;
		
		System.out.println("How many orders of rice and beans would you like? >>");
		riceAndBeansOrdered = input.nextDouble();
		tacoPrice = riceAndBeansOrdered * taco;
		
		System.out.println("How many tacos would you like? >>");
		tacoOrdered = input.nextDouble();
		tacoPrice = tacoOrdered * taco;
	}

}
