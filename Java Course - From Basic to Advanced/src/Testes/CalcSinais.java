package Testes;

import java.util.Scanner;

public class CalcSinais {

	public static  void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String teste ="";
		
		while (!teste.equalsIgnoreCase("sair")) {
		
			System.out.print("Informe um número: ");
			double num1 = entrada.nextDouble();
			
			System.out.print("Informe um número: ");
			double num2 = entrada.nextDouble();
			
			System.out.print("Informe a operação: ");
			String sinal = entrada.next();
			
			double resultado;
			
			resultado = "+".equals(sinal) ? num1 + num2 : 0;
			resultado = "-".equals(sinal) ? num1 - num2 : resultado;
			resultado = "*".equals(sinal) ? num1 * num2 : resultado;
			resultado = "/".equals(sinal) ? num1 / num2 : resultado;
			resultado = "%".equals(sinal) ? num1 % num2 : resultado;
			
			System.out.printf("%.2f %s %.2f = %.2f", num1, sinal, num2, resultado);
			System.out.println(" ");
		}
		
		entrada.close();
	}

}
  