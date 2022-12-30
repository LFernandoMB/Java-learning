package colecoes;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack <String> pilha = new Stack <>(); // Ctrl + Shift + O
		
		pilha.push("Os amigos"); // Insere um elemento na lista
		pilha.push("Robson Cruzoé"); 
		pilha.push("Gabriela"); 
		
		System.out.println(pilha.peek()); // Retorna o último elemento da pilha, retorna erro se vazio - Não retira o elemento da pilha

		System.out.println(pilha.pop());  // Retorna o último elemento da pilha, retorna erro se vazio - Retira o elemento da pilha
		System.out.println(pilha.pop());  // Retorna o último elemento da pilha, retorna erro se vazio - Retira o elemento da pilha
		System.out.println(pilha.pop());  // Retorna o último elemento da pilha, retorna erro se vazio - Retira o elemento da pilha
		
	}
}
