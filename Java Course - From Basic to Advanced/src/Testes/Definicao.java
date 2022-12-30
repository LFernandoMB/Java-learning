package Testes;

public class Definicao {
	
	String sinal;
	double num1, num2;
	
	Definicao(String sinal, double num1, double num2){
		this.sinal = sinal;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	double resto(double num1, double num2) {
		return num1 % num2;
	}
	
	double chamada() {
		if (this.sinal == "+") {
			return somar(this.num1,this.num2);
		}else if (this.sinal == "-") {
			return subtrair(this.num1,this.num2);
		}else if (this.sinal == "*") {
			return multiplicar(this.num1,this.num2);
		}else if (this.sinal == "/") {
			return dividir(this.num1,this.num2);
		}else if (this.sinal == "%") {
			return resto(this.num1,this.num2);
		}else {
			return 0.0;
		}
	}
}
