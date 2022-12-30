package poo.encapsulamento.casa2;

import poo.encapsulamento.casa1.Sogra;
import poo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {
	
	String segredoDoCasal = "Meu marido está quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem... " + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia);
		
		//Genro marido = new Genro();
		//System.out.println(marido.); // Consegue acessar pois está como privada
		
		Sogro pai = new Sogro();
		System.out.println(pai.gostaDeCerveja); //Informação Pública
		
		//Sogra mae = new Sogra(); // Modo errado de conseguir a informação
		//System.out.println(mae.segredoDeFamilia); // Quando herda a informação ela pode ser acessada pela própria instância
		
	}
}
