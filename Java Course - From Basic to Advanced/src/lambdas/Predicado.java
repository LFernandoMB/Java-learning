package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		// Verificando apenas se o número é par
		System.out.println(isPar.test(12));
		
		// Executando uma operação lógica do tipo AND compondo as duas funções
		System.out.println(isPar.and(isTresDigitos).test(123));
		
		// Negando a operação lógica
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		
		// Executando uma operação lógica do tipo OR compondo as duas funções
		System.out.println(isPar.or(isTresDigitos).test(123));
	}
}
