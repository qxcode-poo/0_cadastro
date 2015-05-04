package testes;

import cadastro.ICadastroAluno;
import visaoaluno.Cadastro;

public class CadastroConcTester extends CadastroAbsTester{

	@Override
	public ICadastroAluno getAgendaConcret() {
		// TODO Auto-generated method stub
		return new Cadastro();
	}

}
