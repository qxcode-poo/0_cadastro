package cadastro.aluno;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import cadastro.ICadastro;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public abstract class CadastroAbsTester {
	public abstract ICadastro getAgendaConcret();

	@Test
	public void aAdicaoContagem(){
		ICadastro cadastroTest = getAgendaConcret();
		cadastroTest.resetAgenda(10);
		
		assertTrue(cadastroTest.getContatos().size() == 0);
		assertTrue(cadastroTest.adicionarContato("11110000", "Pedro Álvares"));
		assertTrue(cadastroTest.adicionarContato("11110010", "Dom Pedro"));
		assertTrue(cadastroTest.adicionarContato("11110020", "Rio Branco"));
		
		//Inserir Telefone Duplicado
		assertFalse(cadastroTest.adicionarContato("11110020", "Rio Nilo"));
		
		assertTrue(cadastroTest.getContatos().size() == 3);
		
		assertTrue(cadastroTest.getContatoByTel("11110010")!=null);
		
		assertTrue(cadastroTest.adicionarContato("22220000", "Pedro Álvares"));
		assertTrue(cadastroTest.adicionarContato("33330000", "Pedro Álvares"));
		
		assertTrue(cadastroTest.adicionarContato("22220010", "Dom Pedro"));
		assertTrue(cadastroTest.adicionarContato("22220020", "Rio Branco"));
	}
	
	@Test
	public void bRemocaoListagem(){
		ICadastro cadastroTest = getAgendaConcret();
		cadastroTest.resetAgenda(4);
		
		assertTrue(cadastroTest.adicionarContato("11110040", "Pedro Álvares"));
		assertTrue(cadastroTest.adicionarContato("11110050", "Dom Pedro"));
		assertTrue(cadastroTest.adicionarContato("11110060", "Floriano Peixoto"));
		
		//Remover contato existente e verificar quantidade de contatos
		assertTrue(cadastroTest.removerContato("11110040"));
		assertTrue(cadastroTest.getContatos().size()==2);
		
		//Remover contato nao existente e verificar quantidade de contatos
		assertFalse(cadastroTest.removerContato("11118888"));
		assertTrue(cadastroTest.getContatos().size()==2);
		
		assertTrue(cadastroTest.adicionarContato("35420070", "Marechal Deororo"));
		assertTrue(cadastroTest.adicionarContato("35480080", "Joaquim Manoel"));
		assertTrue(cadastroTest.getContatos().size()==4);
		
		//Estourar Limite de Contatos
		assertFalse(cadastroTest.adicionarContato("35410090", "Chico Xavier"));

		assertTrue(cadastroTest.getContatos()!=null);
		
	}
	
	@Test
	public void cListasTelefones(){
		ICadastro cadastroTest = getAgendaConcret();
		cadastroTest.resetAgenda(10);
		
		assertTrue(cadastroTest.getContatos().size() == 0);
		assertTrue(cadastroTest.adicionarContato("11110000", "Pedro Álvares"));
		assertTrue(cadastroTest.adicionarContato("11110010", "Dom Pedro"));
		assertTrue(cadastroTest.adicionarContato("11110020", "Rio Branco"));
		
		assertTrue(cadastroTest.getContatos().size() == 3);
		
		assertTrue(cadastroTest.getContatoByTel("11110010")!=null);
		
		assertTrue(cadastroTest.adicionarContato("22220000", "Pedro Álvares"));
		assertTrue(cadastroTest.adicionarContato("33330000", "Pedro Álvares"));
		
		assertTrue(cadastroTest.adicionarContato("22220010", "Dom Pedro"));
		assertTrue(cadastroTest.adicionarContato("22220020", "Rio Branco"));
		
		//Quantidade de telefones do Pedro
		assertTrue(cadastroTest.getTelefones("Pedro Álvares").size()==3);
		
		//Ronildo não tem telefone
		assertTrue(cadastroTest.getTelefones("Ronildo Oliveira").size()==0);
	}

}