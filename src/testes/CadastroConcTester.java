package testes;

import cadastro.TesteCadastro;
import cadastro.ICadastro;
import visaoaluno.Cadastro;

public class CadastroConcTester extends TesteCadastro{

	@Override
	public ICadastro getAgendaConcret() {
		// TODO Auto-generated method stub
		return new Cadastro();
	}

}
