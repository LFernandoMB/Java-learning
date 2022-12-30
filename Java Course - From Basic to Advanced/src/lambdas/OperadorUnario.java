package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n +2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n* n;
		
		// Compondo funções e executando a ordem com o "andThen"
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(resultado1);
		// Compondo funções e executando a ordem reversa com o "compose"
		int resultado2 =aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(resultado2);

	}
}
