package colecoes;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConjuntos {

	public static void main(String[] args) {
		Set <String> conjunto = new TreeSet<>(); // Respeita a ordem crescente e alfabetica
		//Set <String> conjunto = new LinkedHashSet<>(); // Respeita a ordem de inserção
		//Set <String> conjunto = new HashSet<>(); // Não respeita a ordem de inserção
		conjunto.add("João");
		conjunto.add("Pedro");
		conjunto.add("Maria");
		conjunto.add("Rafael");
		
		System.out.println(conjunto);
		
		// Quando pode retornar tipos diferente usamos o "Object"
//		for(Object item: conjunto) {
//			System.out.println(item);
//		}	
		
		for(String item: conjunto) {
			System.out.println(item);
		}
	}
}
