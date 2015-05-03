package cadastro.aluno;

import java.util.ArrayList;
import java.util.List;

import visaoaluno.Contato;
import cadastro.ICadastro;
import cadastro.IContato;

public class Cadastro implements ICadastro {
	
	private List<IContato> listaContatos;
	private int maxContatos = 0;
	
	//Complete a função que verifique se a string é feita apenas de números
	boolean validaTelefone(String telefone){
		
		return false;
	}
	
	//inicia a agenda apagando qualquer contato que nela possua.
	//também seta o limite da memória para adicionar contatos.
	@Override
	public boolean resetAgenda(int maxContatos) {
		return true;
	}

	//Adiciona um contato a agenda passando nome e telefone
	//Nao podem existir duas entradas com o mesmo telefone
	//
	//O telefone deve ser composto apenas de digitos.
	//O nome não pode estar vazio
	//
	//Se o contato foi adicionado com sucesso retorne true
	@Override
	public boolean adicionarContato(String telefone, String nome) {
		return false;
	}
	
	//Função que retorna o nome do contato a partir do seu telefone
	@Override
	public IContato getContatoByTel(String telefone) {
		return null;
	}
	
	//atualiza o contato com esse Telefone
	//retorne false caso telefone não seja encontrado ou
	//nao esteja de acordo com os requisitos para adicionar um novo contato
	@Override
	public boolean atualizarContato(String telefone, String nome) {
		return false;
	}
	
	//remove o contato desse telefone
	@Override
	public boolean removerContato(String telefone) {
		return false;
	}

	//devolve todos os telefones da lista
	@Override
	public List<String> getContatos() {
		return null;
	}

	//Dado o nome de um contato retorne a lista de telefones
	//que ele possui. Caso o contato não exista, retorne null.
	//A lista deve ser ordenada pela ordem de inserção na agenda,
	//ou seja, os primeiros inseridos devem aparecer primeiro na lista
	@Override
	public List<String> getTelefones(String contato) {	
		return null;
	}

}
