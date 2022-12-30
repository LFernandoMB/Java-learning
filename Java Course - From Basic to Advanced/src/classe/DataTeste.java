package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data nascimento = new Data();
		
		nascimento.dia = 14;
		nascimento.mes = 10;
		nascimento.ano = 1994;
		
		Data casamento = new Data(28, 11, 2018);
		// System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		// System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
		System.out.printf(nascimento.apresentar());
		System.out.println();
		System.out.printf(casamento.apresentar());
	}
}
