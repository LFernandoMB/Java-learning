package api;

public class ExplorandoStrings {
	
	public static void main(String[] args) {
		//String nome = new String("Leonardo"); // Método de fazer 1
		String nome = "Leo" + "nardo"; // Método mais comum (Padrão)
		
		// Transforma todas as letras em maiusculas >> toLowerCase transforma em mínusculas
		System.out.println(nome.toUpperCase()); //LEONARDO
		
		// Tamanho ou quantidade de elementos
		System.out.println(nome.length()); // 8
		
		// Pega os dados dos indices de 0 à 3 (3 Não incluso)
		System.out.println(nome.substring(0, 3)); // Leo
		
		// Enontra a posição do caracter informado
		System.out.println(nome.indexOf('d')); // 6
		
		// Retorna o caracter correspondente ao indice informado
		System.out.println(nome.charAt(6)); // d
		
		// Compara os valores ignorando case sensitive
		System.out.println(nome.equalsIgnoreCase("leonardo")); // true
		
		// Verifica se a info começa com "Leo" >> endWith("valor") verifica se o final da info é...
		System.out.println(nome.startsWith("Leo")); // true
		
		// Verifica se a String está vazia
		System.out.println(nome.isEmpty()); // false
		
		// Concatena as informações com a variável
		System.out.println(nome.concat(" é legal!").concat("!")); // Leonardo é legal!!
		
		// Váriavel não mudou
		System.out.println(nome); // Leonardo
		
		// Alterando o valor da variável somente por atribuição
		nome = "Luis Fernando";
		System.out.println(nome); // Luis Fernando
	}
}
