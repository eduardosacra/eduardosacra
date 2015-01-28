import java.util.Calendar;

import br.com.caelum.jdbc.modelo.Contato;
import br.com.jdbc.dao.ContatoDao;


public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Eduardo");
		contato.setEmail("eduardo.sacra.sousa@gmail.com");
		contato.setEndereco("rua das pamonhas");
		contato.setDataNacsimento(Calendar.getInstance());
		
		//grave nessa conexao
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.adiciona(contato);

	}

}
