package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.produto = "Noteboo Acer 15' 8GB";
		produto1.preco = 2300;
		
		Produto produto2 = new Produto("Caneta Bic Preta", 2.83);
		
		System.out.println(produto1.precoComDesconto()); // Sem desconto
		System.out.println(produto2.precoComDesconto()); // Sem desconto
		
		Produto.desconto = 0.15;
		
		System.out.println(produto1.precoComDesconto()); // Com desconto
		System.out.println(produto2.precoComDesconto()); // Com desconto
	}
}
