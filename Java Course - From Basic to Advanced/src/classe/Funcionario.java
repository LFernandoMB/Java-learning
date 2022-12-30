package classe;

public class Funcionario {

	String nome;
	double salario;
	String funcao;
	
	Funcionario(){
		
	}
	
	Funcionario (String n, double s, String f){
		nome = n;
		salario = s;
		funcao = f;
	}
	
	String apresentar() {
		// return String.format("Nome: " + nome + "\n" + "Função: " + funcao + "\n" + "Salário: " + salario);
		return String.format("Nome: %s \nFunção: %s \nSalário: R$%s", nome, funcao, salario);
	}
}
