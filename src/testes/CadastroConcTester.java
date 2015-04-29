package testes;

import interfaces.ICadastro;
import visaoaluno.Cadastro;

public class CadastroConcTester extends CadastroAbsTester{

	@Override
	public ICadastro getAgendaConcret() {
		// TODO Auto-generated method stub
		return new Cadastro();
	}

}
