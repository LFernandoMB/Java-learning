package api;

public class ExplorandoMath {
	public static void main(String[] args) {
		// classe Math não precisa ser instânciada par usar alguns métodos
		
		// Valor de PI
		System.out.println(Math.PI); // 3.141592653589793
		
		// Módulo
		System.out.println(Math.abs(-10.5)); // 10.5
		
		// Potencia
		System.out.println(Math.pow(2, 3)); // 8.0
		
		// Retorna o menor valor
		System.out.println(Math.min(70, 7)); // 7
		
		// Retorna o maior valor
		System.out.println(Math.max(70, 7)); // 70
		
		//Arredondar valores
		System.out.println(Math.ceil(6.55)); // 7.0
		
		// Arredondando para baixo
		System.out.println(Math.floor(6.55)); // 6.0
		
		// Retorna um valor aleatório entre 0 e 1
		System.out.println(Math.random());
	}
}
