package desafioVisibilidade.familia.casaB;

import desafioVisibilidade.familia.casaA.Ana;

public class Pedro extends Ana {
	// Como Pedro herda de Ana, não precisa instanciar Ana, ele pode chamar os atributos diretamente.
	void testeAcessos(){
//		System.out.println(segredo);
//		System.out.println(facoDentroDeCasa);
		System.out.println(FormaDeFalar);
		System.out.println(todosSabem);
	}
}
