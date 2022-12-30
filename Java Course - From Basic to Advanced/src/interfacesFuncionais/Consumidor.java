package interfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		// Cria uma função que recebe um parâmetro apenas e não retorna nada
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		// Criando objeto p1 instanciado de Produto
		Produto p1 = new Produto("Caneca", 12.34, 0.09);
		
		// Função padrão de um Consumer para executar o método atribuído
		imprimir.accept(p1);
		
		// Criando outras instâncias de Produto
		Produto p2 = new Produto("Notecook", 2999.99, 0.25);
		Produto p3 = new Produto("Caderno", 18.00, 0.03);
		Produto p4 = new Produto("Borracha", 2.99, 0.18);
		Produto p5 = new Produto("Lapis", 3.29, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		// Usando a função lambda atribuída a "imprimir" para apresentar apenas os nomes
		produtos.forEach(imprimir);
		
		// Usando foreach para acessar os preços dos produtos de forma manual
		produtos.forEach(p -> System.out.println(p.preco));
		
		// Apresentando informações do produto via toString()
		produtos.forEach(System.out::println);
	}

}
