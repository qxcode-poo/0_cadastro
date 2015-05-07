package cadastro.aluno;

import java.util.List;

public class Cadastro{
	
	//private List<IContato> listaContatos;
	//private int maxContatos = 0;
	
	//Complete a função que verifique se a string é feita apenas de números
	boolean validaTelefone(String telefone){		
		return false;
	}
	
	//inicia a agenda apagando qualquer contato que nela possua.
	//também seta o limite da memória para adicionar contatos.	
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
	public boolean adicionarContato(String telefone, String nome) {
		return false;
	}
	
	//Função que retorna o nome do contato a partir do seu telefone
	public Contato getContatoByTel(String telefone) {
		return null;
	}
	
	//Atualiza o contato com esse Telefone
	//retorne false caso telefone não seja encontrado ou
	//nao esteja de acordo com os requisitos para adicionar um novo contato
	public boolean atualizarContato(String telefone, String nome) {
		return false;
	}
	
	//remove o contato desse telefone
	public boolean removerContato(String telefone) {
		return false;
	}

	//devolve todos os telefones da lista
	//concatene o telefone co o numero do contato:
	//Exemplo:
	// 08007777000 - Aluno TekPix
	public List<String> getContatos() {
		return null;
	}

	//Dado o nome de um contato retorne a lista de telefones
	//que ele possui. Caso o contato não exista, retorne null.
	//A lista deve ser ordenada pela ordem de inserção na agenda,
	//ou seja, os primeiros inseridos devem aparecer primeiro na lista
	public List<String> getTelefones(String contato) {	
		return null;
	}

}