package Testes;

import java.util.Scanner;

public class ErroInt {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
	    System.out.println("Qual a sua idade?");
	    int idade = teclado.nextInt();
	    System.out.println("Qual o seu nome?");
	    String nome = teclado.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    String sobrenome = teclado.nextLine();
	 
	    teclado.close();
	    
	    System.out.printf("%i - %s %s", idade, nome, sobrenome);
	}
}
