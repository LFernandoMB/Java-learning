package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		// Criando a variável "parOuImpar" que aponta para a interface funcional FUNCTION
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		// Função "apply" que aplica a função definida no "parOuImpar" -> Ternário
		System.out.println(parOuImpar.apply(33));
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		// Chama primeiro o "parOuImpar" par ao numero indicado, depois executa "oResultadoE" e por fim executa o empolgado
		// Efeito Cascata -> Encadeamento de Funções
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
	}
}
