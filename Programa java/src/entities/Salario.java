package entities;

public class Salario {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary () {
		return grossSalary -= tax;
	}
	public void increaseSalary(double porcentagem) {
		porcentagem = ((porcentagem / 100)* grossSalary);
		grossSalary += porcentagem;
		//grossSalary += grossSalary * porcentagem /100.0
	}
	public String toString() {
		return 	name + ", $"
				+ grossSalary;
	}
}
