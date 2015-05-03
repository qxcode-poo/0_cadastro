package testes;

import cadastro.TesteCadastro;
import visaoaluno.Cadastro;
import visaoaluno.ICadastro;

public class CadastroConcTester extends TesteCadastro{

	@Override
	public ICadastro getAgendaConcret() {
		// TODO Auto-generated method stub
		return new Cadastro();
	}

}
