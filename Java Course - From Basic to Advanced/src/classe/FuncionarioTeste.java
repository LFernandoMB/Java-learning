package classe;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario colaborador1 = new Funcionario();
		Funcionario colaborador2 = new Funcionario("Pedro", 1250, "Técnico");
		
		colaborador1.nome = "João";
		colaborador1.salario = 1200;
		colaborador1.funcao = "Operador";
		
		System.out.println(colaborador1.apresentar());
		System.out.println();
		System.out.println(colaborador2.apresentar());
	}
}
