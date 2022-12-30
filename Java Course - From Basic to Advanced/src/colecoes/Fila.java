package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); // Ctrl + Shift + O
		fila.offer("Maria"); // Adicionando item na fila, caso não consiga retorna false *
		fila.offer("João");
		fila.add("Pedro");   // Adicionando item na fila, caso não consiga retorna um erro
		
		System.out.println("Peek/Element...");
		System.out.println(fila.peek());    // Retorna primeiro elemento da fila, se vazio retorna null - Não retira o elemento *
		System.out.println(fila.element()); // Retorna primeiro elemento da fila, se vazio retorna erro - Não retira o elemento
		
		System.out.println("Poll/Remove...");
		System.out.println(fila.poll());   // Retorna o primeiro elemento da lista, se vazio retorna null - Retira o elemento da fila *
		System.out.println(fila.remove()); // Retorna o primeiro elemento da lista, se vazio retorna erro - Retira o elemento da fila
	}
}
