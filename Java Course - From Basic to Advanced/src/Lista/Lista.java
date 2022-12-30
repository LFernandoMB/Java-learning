package Lista;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<> ();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1); // Adicionando objeto já criado à lista
		lista.add(new Usuario("Carlos")); // Criando e Adicionando Objetos à lista
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome); // Acessando item pelo index e apresentando atributo nome
		
		for(Usuario u: lista) {
			System.out.println(u.toString());
		}
	}

}
