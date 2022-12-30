package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class FilaPilha {
	public static void main(String[] args) {
		Deque <String> pilhaefila = new ArrayDeque <> (); // Ctrl + Shift + O
		
		// Adicionando itens ao elemento
		System.out.println("Add...");
		System.out.println(pilhaefila.offer("Teste01"));
		System.out.println(pilhaefila.offer("Teste02"));
		System.out.println(pilhaefila.offer("Teste03"));
		System.out.println(pilhaefila.offer("Teste04"));
		System.out.println(pilhaefila.offer("Teste05"));
		
		// Visualizando items dentro do elemento
		System.out.println(pilhaefila.peek()); // Retorna o primeiro item do elemento, não retira o item do elemento
		
		// Retirando itens e apresentando
		System.out.println(pilhaefila.pop());  // Retorna o primeiro item do elemento, retira o item do elemento
		System.out.println(pilhaefila.poll()); // Retorna o primeiro item do elemento, retira o item do elemento
		
	}
}
