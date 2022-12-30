package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach1 {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println("Forma Tradicional...");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		
		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> System.out.println(nome + "???")); // Retirado as chaves porque é uma expressão apenas
		
		System.out.println("\nMethod Reference #01");
		aprovados.forEach(System.out::println); // Passando uma referencia para o forEach - Referência de Método
		
		System.out.println("\nLambda #03");
		aprovados.forEach(nome -> meuImprimir(nome)); // Chamando uma outra função
		
		System.out.println("\nMethod Reference #02");
		aprovados.forEach(Foreach1::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Olá meu nome é " + nome);
	}

}
