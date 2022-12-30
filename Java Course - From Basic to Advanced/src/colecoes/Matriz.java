package colecoes;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
//		double notasJoao [][] = {{7.7, 8.6}, {6.2, 9.7}};
//		double notasPedro [][] = new double [2][];
//		
//		notasPedro[0] = new double[2];
//		notasPedro[1] = new double[2];
//		notasPedro[0][0] = 7.7;
//		notasPedro[0][1] = 8.6;
//		notasPedro[1][0] = 6.2;
//		notasPedro[1][1] = 9.7;
//		
//		double totalJoao = 0;
//		int qtdeNotasJoao = 0;
//		
//		double totalPedro = 0;
//		int qtdeNotasPedro = 0;
//		
//		for (int i=0; i < notasJoao.length; i++) {
//			for(int j=0; j < notasJoao[i].length; j++) {
//				totalJoao += notasJoao[i][j];
//				qtdeNotasJoao++;
//			}
//		}
//		
//		for (double notasParciais []: notasPedro) {
//			for (double nota: notasParciais) {
//				totalPedro += nota;
//				qtdeNotasPedro++;
//			}
//		}
//		
//		System.out.println(totalJoao / qtdeNotasJoao);
//		System.out.println(totalPedro / qtdeNotasPedro);
		
		//ModalGR - 27 de nov. de 2022
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qtde de Alunos: : ");
		int qtdeAlunos = teclado.nextInt();
		
		System.out.print("Qtde de Notas: : ");
		int qtdeNotas = teclado.nextInt();

		double[][] calcNotas = new double [qtdeAlunos][qtdeNotas];
		double totalNotas = 0;
		
		for (int a = 0; a < qtdeAlunos; a++) {
			for (int n = 0; n < qtdeNotas; n++) {
				System.out.printf("Digite a nota [%d] do aluno [%d]: ", n+1, a+1);
				calcNotas [a][n] = teclado.nextDouble();
				totalNotas += calcNotas [a][n];
			}
		}
		
		System.out.println("Média da turma é de: " + (totalNotas/(qtdeAlunos * qtdeNotas)));
		
		for (double[] notasDosAlunos: calcNotas) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}
		
		teclado.close();
	}
}
