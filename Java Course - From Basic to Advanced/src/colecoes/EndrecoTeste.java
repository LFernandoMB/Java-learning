package colecoes;

public class EndrecoTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		
		// Compara endereço de memória
		System.out.println(endereco1 == endereco2);  
		
		// Compara endereço de memória quando não está implementado na classe do objeto
		System.out.println(endereco1.equals(endereco2) ); // Após Gerar o hascode e o equals ele começa a comparar os valores dos objetos

	}

}
