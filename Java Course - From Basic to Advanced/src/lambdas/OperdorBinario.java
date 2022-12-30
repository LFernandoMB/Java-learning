package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperdorBinario {

	public static void main(String[] args) {
		// Forma 1 -> Apresentando os tipos 
		BinaryOperator<Double> media1 = (Double n1, Double n2) -> (n1 + n2)/2;
		System.out.println(media1.apply(9.8, 5.7));
		
		// Forma 2 -> Sem apresentar os tipos (Padrão)
		BinaryOperator<Double> media2 = (n1,n2) -> (n1 + n2)/2;
		System.out.println(media2.apply(9.8, 5.7));
		
		// Forma 1 -> Criando uma função com parâmetros de tipos diferentes, sem chaves pois executa uma única expressão
		BiFunction<Double, Double, String> resultado1 = (n1,n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado1.apply(9.7, 7.1));
		
		// Forma 2 -> Função com chaves pois executa mais comando dentro do escopo
		BiFunction<Double, Double, String> resultado2 = (n1,n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado2.apply(9.7, 4.1));
		
		// Compondo uma Binary Operator com uma Function 
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media1.andThen(conceito).apply(9.7, 5.9));
				
	}

}
