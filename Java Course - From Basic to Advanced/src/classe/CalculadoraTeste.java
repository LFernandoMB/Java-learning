package classe;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(10, 20));
		
		calc.adicionar(5);
		
		System.out.println(calc.apresentar());
		
		calc.zerar();
		
		System.out.println(calc.apresentar());
	}
}
