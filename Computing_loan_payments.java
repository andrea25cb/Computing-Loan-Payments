package trabajos_programacion_def;

import java.util.Scanner;

public class Computing_loan_payments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Enter the loan and this will add the interest: ");
		
	Scanner teclado = new Scanner (System.in);
	
	System.out.print("LOAN: ");
		double loanAmount = teclado.nextDouble();
		
	System.out.print("INTEREST: ");
		double monthlyInterestRate = teclado.nextDouble()/1200;
		
	System.out.println("De cuántos años es la deuda:");
		double numberOfYears = teclado.nextDouble();
		
		//monthlyInterestRate = numberOfYears /1200;
		
		double monthlyPayment= loanAmount*monthlyInterestRate / (1-1/( Math.pow(1+ monthlyInterestRate,  numberOfYears*12)));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("El precio mensual a pagar es: " + monthlyPayment);
		System.out.println("El precio anual sería: " + totalPayment);
		
	}

	private static int pow(double d, double e) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void pow(long l) {
		// TODO Auto-generated method stub
		
	}

}
