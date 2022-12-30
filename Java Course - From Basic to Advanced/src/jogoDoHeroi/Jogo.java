package jogoDoHeroi;

public class Jogo {

	public static void main(String[] args) {
		
		// Modelo de criação do objeto Estático
		Monstro monstro = new Monstro();
		monstro.personagem = "Monstro";
		monstro.x = 10;
		monstro.y = 10;
		
		// Modelo de criação do objeto Dinâmico
		Jogador heroi = new Heroi();
		heroi.personagem = "Heroi";
		heroi.x = 10;
		heroi.y = 11;
		
		
		System.out.println(monstro.status());
		System.out.println(heroi.status());
		System.out.println();
		
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		System.out.println(monstro.status());
		System.out.println(heroi.status());
		System.out.println();
	}

}
