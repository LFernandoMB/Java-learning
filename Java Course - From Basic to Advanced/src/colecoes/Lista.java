package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List <String> aprovados = new ArrayList<>(); // Ctrl + Shift + O >> Inserir Importações
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println("Get...");
		System.out.println(aprovados);
		System.out.println(aprovados.get(0));
		System.out.println(aprovados.get(1));
		
		System.out.println("Add..");
		System.out.println(aprovados.add("Maria")); // Quando add corretamente retorna true e quando não retorna false
		System.out.println("Size... " + aprovados.size());
		
		System.out.println("Remove...");
		System.out.println(aprovados);
		System.out.println(aprovados.remove("Maria")); // Deleta o primeiro item existente, retorna true se removido com sucesso e false se não
		System.out.println(aprovados);
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}	
	}
}
