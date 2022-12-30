package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsDicionarios {

	public static void main(String[] args) {
		Map <Integer, String> aprovados = new HashMap <>(); // Ctrl + Shift + O
		aprovados.put(1, "Pedro"); // Adicionando itens no elemento
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		// Apresentando os valores gerais
		System.out.println(aprovados);
		
		// Alterando valor da chave que já existe
		aprovados.put(1, "João");     
		System.out.println(aprovados);
		
		// Apresentando as chaves do elemento
		System.out.println(aprovados.keySet());
		
		// Apresentando os valores do elemento
		System.out.println(aprovados.values());
		
		// Apresentando os valores gerais
		System.out.println(aprovados.entrySet());
		
		// Apresentando valor de uma chave específica
		System.out.println(aprovados.get(2));
		
		// Verifica se contem a chave "4" no elemnento - Retorna true se sim e false se não
		System.out.println(aprovados.containsKey(4));
		
		// Verifica se contem o valor "Bia" no elemnento - Retorna true se sim e false se não
		System.out.println(aprovados.containsValue("Bia"));
		
		// Apresentar só chave ou só valor com for
		for(String nome: aprovados.values()) {
			System.out.println(nome);
		}
		
		for(int chave: aprovados.keySet()) {
			System.out.println(chave);
		}
		
		// Apresentando Chave e Valor
		for(Entry<Integer, String> registro: aprovados.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
	}
}
