package cadastro.aluno;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	
	private List<Contato> listaContatos = new ArrayList<Contato>();
	private int maxContatos = 0;
	
	
	boolean validaTelefone(String telefone){
		if (telefone.matches("[0-9]+"))
			return true;
		return false;
	}
	
	public boolean resetAgenda(int maxContatos) {
		// TODO Auto-generated method stub
		this.maxContatos = maxContatos;
		
		this.listaContatos.removeAll(listaContatos);
		return true;
	}

	public boolean adicionarContato(String telefone, String nome) {
		// TODO Auto-generated method stub
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

	public Contato getContatoByTel(String telefone) {
		// TODO Auto-generated method stub
		for (Contato iContato : listaContatos) {
			if (iContato.getTelefone().equals(telefone)) {
				return iContato;
			}
		}
		return null;
	}

	public boolean atualizarContato(String telefone, String nome) {
		// TODO Auto-generated method stub
		for (Contato iContato : listaContatos) {
			if(iContato.getTelefone().equals(telefone) && nome != null){
				iContato.setNome(nome);
			}
		}
		return false;
	}

	public boolean removerContato(String telefone) {
		// TODO Auto-generated method stub
		for (Contato iContato : listaContatos) {
			if(iContato.getTelefone().equals(telefone)){
				listaContatos.remove(iContato);
				return true;
			}
		}
		return false;
	}

	public List<String> getContatos() {
		// TODO Auto-generated method stub
		List<String> listaTelefones = new ArrayList<String>();
		
		for (Contato iContato : listaContatos) {
			listaTelefones.add(iContato.getTelefone()+" - "+iContato.getNome());
		}

		return listaTelefones;
	}

	public List<String> getTelefones(String contato) {
		// TODO Auto-generated method stub
		List<String> listaTelefones = new ArrayList<String>();
		
		for (Contato iContato : listaContatos) {
			if (iContato.getNome().equals(contato)) {
				listaTelefones.add(iContato.getTelefone());
			}
		}		
		return listaTelefones;
	}

}
