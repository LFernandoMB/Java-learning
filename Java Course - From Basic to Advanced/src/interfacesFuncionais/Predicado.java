package interfacesFuncionais;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		// Predicate - Recebe um tipo como parâmetro e retorna verdadeiro ou falso - Baseado em alguma análise
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		// Criando um produto e utilizando método "test" do Predicate para aplicar análise
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
		
		// Alterando valor do desconto para testar o resultado do "test"
		produto.desconto = 0.85;
		System.out.println(isCaro.test(produto));
	}
}
