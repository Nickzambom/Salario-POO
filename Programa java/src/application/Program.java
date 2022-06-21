package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Salario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		Salario salario = new Salario ();
		
		System.out.print("Name: ");
		salario.name = ler.nextLine();
		System.out.print("Gross Salary: ");
		salario.grossSalary = ler.nextDouble();
		System.out.print("Tax: ");
		salario.tax = ler.nextDouble();
		salario.netSalary();
		
		System.out.println("Employee: " + salario );
		
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = ler.nextDouble();
		salario.increaseSalary(porcentagem);
		
		System.out.println("Updated data: "+salario);
		ler.close();
	}

}
