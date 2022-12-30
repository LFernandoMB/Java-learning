package classe;

public class ContaCosmo {
	
	String validar (long dado) {
		String resultado = Long.toString(dado);
		
		while (resultado.length() < 11) {
			resultado = "0" + resultado;
		}
		
		String resposta = "Conta verificada > " + resultado;
		
		return resposta;
	}
}
