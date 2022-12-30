package desafioCarros;

public class Carros {
	
	int velocidadeAtual = 0;
	boolean ligado = false;
	int delta = 5;
	final int VELOCIDADE_MAXIMA;
	
	Carros (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if ((velocidadeAtual + delta) > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;
		}
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString()
	{
		return "Velocidade atual do carro é " + velocidadeAtual + "Km/h de " + VELOCIDADE_MAXIMA + "Km/h";
	}
}
