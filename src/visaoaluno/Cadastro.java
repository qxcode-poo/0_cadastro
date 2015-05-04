package visaoaluno;

import java.util.ArrayList;
import java.util.List;

import cadastro.ICadastroAluno;
import cadastro.IContato;

public class Cadastro implements ICadastroAluno {
	
	private List<IContato> listaContatos;
	private int maxContatos = 0;
	
	
	boolean validaTelefone(String telefone){
		if (telefone.matches("[0-9]+"))
			return true;
		return false;
	}
	
	@Override
	public boolean resetAgenda(int maxContatos) {
		// TODO Auto-generated method stub
		this.maxContatos = maxContatos;
		this.listaContatos = new ArrayList<IContato>();
		this.listaContatos.removeAll(listaContatos);
		return true;
	}

	@Override
	public boolean adicionarContato(String telefone, String nome) {
		// TODO Auto-generated method stub
		IContato iContato = new Contato(telefone, nome);
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

	@Override
	public IContato getContatoByTel(String telefone) {
		// TODO Auto-generated method stub
		for (IContato iContato : listaContatos) {
			if (iContato.getTelefone().equals(telefone)) {
				return iContato;
			}
		}
		return null;
	}

	@Override
	public boolean atualizarContato(String telefone, String nome) {
		// TODO Auto-generated method stub
		for (IContato iContato : listaContatos) {
			if(iContato.getTelefone().equals(telefone) && nome != null){
				iContato.setNome(nome);
			}
		}
		return false;
	}

	@Override
	public boolean removerContato(String telefone) {
		// TODO Auto-generated method stub
		for (IContato iContato : listaContatos) {
			if(iContato.getTelefone().equals(telefone)){
				listaContatos.remove(iContato);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<String> getContatos() {
		// TODO Auto-generated method stub
		List<String> listaTelefones = new ArrayList<String>();
		
		for (IContato iContato : listaContatos) {
			listaTelefones.add(iContato.getTelefone());
		}

		return listaTelefones;
	}

	@Override
	public List<String> getTelefones(String contato) {
		// TODO Auto-generated method stub
		List<String> listaTelefones = new ArrayList<String>();
		
		for (IContato iContato : listaContatos) {
			if (iContato.getNome().equals(contato)) {
				listaTelefones.add(iContato.getTelefone());
			}
		}		
		return listaTelefones;
	}

}
