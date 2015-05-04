package cadastro.aluno;

import java.util.ArrayList;
import java.util.List;

public class Cadastro{
	
	private List<Contato> listaContatos;
	private int maxContatos = 0;
	
	//Complete a função que verifique se a string é feita apenas de números
	boolean validaTelefone(String telefone){		
		if (telefone.matches("[0-9]+"))
			return true;
		return false;
	}
	
	//inicia a agenda apagando qualquer contato que nela possua.
	//também seta o limite da memória para adicionar contatos.	
	public boolean resetAgenda(int maxContatos) {
		this.maxContatos = maxContatos;
		this.listaContatos = new ArrayList<Contato>();
		this.listaContatos.removeAll(listaContatos);
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
		Contato iContato = new Contato(telefone, nome);
		if (getContatoByTel(telefone) == null) {
			if (validaTelefone(telefone) && nome != null){
				if (this.listaContatos.size() < this.maxContatos) {
				this.listaContatos.add(iContato);
					return true;			
				}
			}
		}
		return false;
	}
	
	//Função que retorna o nome do contato a partir do seu telefone
	public Contato getContatoByTel(String telefone) {
		for (Contato iContato : listaContatos) {
			if (iContato.getTelefone().equals(telefone)) {
				return iContato;
			}
		}
		return null;
	}
	
	//Atualiza o contato com esse Telefone
	//retorne false caso telefone não seja encontrado ou
	//nao esteja de acordo com os requisitos para adicionar um novo contato
	public boolean atualizarContato(String telefone, String nome) {
		for (Contato iContato : listaContatos) {
			if(iContato.getTelefone().equals(telefone) && nome != null){
				iContato.setNome(nome);
			}
		}
		return false;
	}
	
	//remove o contato desse telefone
	public boolean removerContato(String telefone) {
		for (Contato iContato : listaContatos) {
			if(iContato.getTelefone().equals(telefone)){
				listaContatos.remove(iContato);
				return true;
			}
		}
		return false;
	}

	//devolve todos os telefones da lista
	public List<String> getContatos() {
		List<String> listaTelefones = new ArrayList<String>();
		
		for (Contato iContato : listaContatos) {
			listaTelefones.add(iContato.getTelefone());
		}

		return listaTelefones;
	}

	//Dado o nome de um contato retorne a lista de telefones
	//que ele possui. Caso o contato não exista, retorne null.
	//A lista deve ser ordenada pela ordem de inserção na agenda,
	//ou seja, os primeiros inseridos devem aparecer primeiro na lista
	public List<String> getTelefones(String contato) {	
		List<String> listaTelefones = new ArrayList<String>();
		
		for (Contato iContato : listaContatos) {
			if (iContato.getNome().equals(contato)) {
				listaTelefones.add(iContato.getTelefone());
			}
		}		
		return listaTelefones;
	}

}
