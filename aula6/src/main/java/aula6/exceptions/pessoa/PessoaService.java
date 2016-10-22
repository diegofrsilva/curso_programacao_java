package aula6.exceptions.pessoa;

import java.util.ArrayList;
import java.util.List;

import aula6.exceptions.ErroValidacao;

public class PessoaService {

	private List<Pessoa> pessoas;

	public PessoaService() {
		this.pessoas = new ArrayList<>();
	}

	public void salvar(Pessoa pessoa) throws ErroValidacao {
		if (pessoa.getNome() == null) {
			throw new ErroValidacao("nome");
		}
		// throw new NullPointerException("Deu null pointer");
		pessoas.add(pessoa);
		System.out.println("Pessoa salva com sucesso!");
	}

	public List<Pessoa> buscarTodos() {
		return pessoas;
	}
}
