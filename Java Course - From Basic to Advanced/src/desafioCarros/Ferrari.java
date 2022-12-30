package desafioCarros;

public class Ferrari extends Carros{
	
	Ferrari(){
		super(300);
	}
	// Sobreescrevendo o método acelerar chamando 3 vezes a super classe
//	@Override
//	void acelerar() {
//		super.acelerar();
//		super.acelerar();
//		super.acelerar();
//	}
	
	// Sobreescrevendo o método acelerar alterando o valor para esse objeto
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	
	public String toString() {
		return "Velocidade atual da Ferrari é " + velocidadeAtual + "Km/h de " + VELOCIDADE_MAXIMA + "Km/h";
	}
}
