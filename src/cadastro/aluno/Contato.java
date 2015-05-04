package cadastro.aluno;

public class Contato {
	
	private String nome;
	private String telefone;
	
	//Método construtor da classe
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	//Retorna Nome do Usuário
	public String getNome() {
		return this.nome;
	}

	//Atribui valor ao Nome do Usuário
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	//Retorna Telefone do Usuário	
	public String getTelefone() {
		return this.telefone;
	}
	
	//Atribui valor ao Telefone do Usuário
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}