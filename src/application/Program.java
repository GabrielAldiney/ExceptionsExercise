package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<4; i++) {
		System.out.println("Example #" + (i+1));
		System.out.println("Enter account data");
		while(true) {
		try {
		
		
		System.out.println("Number");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Holder");
		String holder = sc.nextLine();
		
		
		System.out.println("Initial balance");
		Double saldo = sc.nextDouble();
		
		System.out.println("Withdraw limit:");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc1 = new Account(number, holder, saldo, withdrawLimit);
		
		while (sc.hasNextLine()) {
		    String linha = sc.nextLine();
		    if (linha.isEmpty()) break;
		}

		
		System.out.println();
		
		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		acc1.withdraw(amount);
		System.out.println("New balance: " + String.format("%.2f", acc1.getBalance()));
		break;
		}
		catch(DomainException e) {
			System.out.println("Withdrawerror: " + e.getMessage());
			break;
		}
		catch (InputMismatchException e) {
		    System.out.println("Input error: please enter a valid number.");
		    sc.nextLine(); 
		}
		}
		System.out.println();
		
		}
		



		sc.close();
		
	}

}
