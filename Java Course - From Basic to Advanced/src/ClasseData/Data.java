package ClasseData;

public class Data {
	
	int dia, mes, ano;
	
	// Método Construtor 1
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}

	// Método Construtor 2
		Data(int d, int m, int a) {
			dia = d;
			mes = m;
			ano = a;
		}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
