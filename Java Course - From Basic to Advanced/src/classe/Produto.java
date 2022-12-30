package classe;

public class Produto {
	String produto;
	double preco;
	static double desconto;
	
	Produto(){
		
	}
	
	Produto(String produto, double preco){
		this.produto = produto;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return preco - preco * desconto;
	}
}
