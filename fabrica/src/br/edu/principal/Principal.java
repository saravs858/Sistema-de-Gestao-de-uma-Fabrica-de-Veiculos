package br.edu.principal;
import br.edu.veiculo.*;

public class Principal {

	public static void main(String[] args) {
		
		Jipe c1 = new Jipe();
		c1.buzinar();
		
		Carro_de_passeio c2 = new Carro_de_passeio();
		c2.buzinar();
		
		Utilitario c3 = new Utilitario();
		c3.buzinar();
	}

}
