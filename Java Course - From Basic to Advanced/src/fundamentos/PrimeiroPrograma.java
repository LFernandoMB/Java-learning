package fundamentos;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue; // Não apresentará o número 2 na tela
			}
			System.out.println(i);
		}
	}
}

