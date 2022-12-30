package desafioCarros;

public class MainCarros {

	public static void main(String[] args) {
		
		// Criando um objeto dinâmico
		Carros c1 = new Cruze();
		System.out.println(c1);
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1);
		c1.frear();
		c1.frear();
		System.out.println(c1);
		
		// Criando um objeto estático
		Ferrari f1 = new Ferrari();
		System.out.println(f1);
		f1.acelerar();
		f1.acelerar();
		System.out.println(f1);
		f1.frear();
		f1.frear();
		f1.frear();
		System.out.println(f1);
		
		Carros car = new Carros(150);
		System.out.println(car);
	}

}
