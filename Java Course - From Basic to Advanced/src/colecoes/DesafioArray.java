package colecoes;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		//ModalGR - 27 de nov. de 2022
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite a quantidade de notas: ");
		int notas = teclado.nextInt();
		
		double notasAluno[] = new double[notas];

		for (int i = 0; i < notas; i++) {
			System.out.printf("Digite a nota %d: ", i+1);
			notasAluno[i] = teclado.nextDouble();
		}
		
		double media = 0;
		for (double nota: notasAluno) {
			media += nota;
		}
		
		System.out.printf("A média do aluno foi de " + (media / notas) );
		
		teclado.close();

	}
}
