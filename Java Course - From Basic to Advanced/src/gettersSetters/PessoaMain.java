package gettersSetters;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(28);
		System.out.println(p1.getIdade());

		p1.setIdade(30);
		System.out.println(p1.getIdade());
	}
}
