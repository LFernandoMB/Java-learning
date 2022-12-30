package poo.encapsulamento.casa2;

// import poo.encapsulamento.casa1.Sogra;
import poo.encapsulamento.casa1.Sogro;

public class Genro {
	private String segredo = "Minha sogra fala demais";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei... " + euMesmo.segredo);
		
		Filha esposa = new Filha();
		System.out.println(esposa.segredoDoCasal); // Consegue acessar pois está como protected mas está no mesmo pacote
		
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja); //Informação Pública
		
		//Sogra sogrinha = new Sogra();
		//System.out.println(sogrinha.segredoDeFamilia); // Não acessa a informação pois é protegida, não estão no mesmo pacote e Genro não herda de Sogra
		
	}
}
