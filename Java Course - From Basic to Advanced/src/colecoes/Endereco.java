package colecoes;

import java.util.Objects;

public class Endereco {

	String logradouro;
	int numero;
	String complemento;
	
	Endereco(String logradouro, int numero, String complemento){
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	// Alt + Shift + S >> Generate hashcode() and equals()... >> Marcar todos os atributos
	@Override
	public int hashCode() {
		return Objects.hash(complemento, logradouro, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(complemento, other.complemento) && Objects.equals(logradouro, other.logradouro)
				&& numero == other.numero;
	}

}
