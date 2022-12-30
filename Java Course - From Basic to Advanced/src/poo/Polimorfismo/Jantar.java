package poo.Polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(80.7);
		
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.160);
		
		/*
		// MODELO ANTIGO
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		pessoa.comer(sorvete);
		*/
		
		pessoa.comer(arroz, feijao, sorvete);
		
		System.out.println(pessoa.getPeso());

	}

}
