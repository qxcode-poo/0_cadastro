package cadastro.aluno;

import cadastro.AbsTesterICadastro;
import cadastro.ICadastro;

public class TesteCadastro extends AbsTesterICadastro{

	@Override
	public ICadastro getAgendaConcret() {
		// TODO Auto-generated method stub
		return new CCadastro();
	}

}
