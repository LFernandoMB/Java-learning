package Testes;

public class testesEquals {

	public static void main(String[] args) {
		String valor1 = "123456789012345";
		Long valor2 = 123456789012345l;
		
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor1 == valor2.toString());
		System.out.println(valor1.equals(valor2.toString()));
	}

}
