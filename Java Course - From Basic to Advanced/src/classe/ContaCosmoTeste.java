package classe;

import java.util.Scanner;

public class ContaCosmoTeste {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		ContaCosmo conta = new ContaCosmo();
		
		long entrada;
		String resultado;
		
		do {
			System.out.print("Informe a conta cosmo: ");
			entrada = scanner.nextLong(); 
			System.out.println("Erro do sistema >> " + entrada);
			resultado = conta.validar(entrada);
			System.out.println(resultado);
			System.out.println("===============================================");
		}while (resultado != "x");
		
		scanner.close();
	}
}
