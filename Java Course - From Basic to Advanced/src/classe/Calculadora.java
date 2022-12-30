package classe;

public class Calculadora {
	
	double resultado;
	// Método que recebe parâmetros e possuí retorno
	double somar(double num1, double num2) {
		resultado = num1 + num2;
		return resultado;
	}
	// Método que recebe parâmetros e não possuí retorno
	void adicionar(double a){
		resultado += a;
	}
	// Método que não recebe parâmetros e possuí retorno
	double apresentar() {
		return resultado;
	}
	// Método que não recebe parâmetros e não possuí retorno
	void zerar() {
		resultado = 0;
	}
}
