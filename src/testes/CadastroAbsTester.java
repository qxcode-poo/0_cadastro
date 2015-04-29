package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import interfaces.ICadastro;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public abstract class CadastroAbsTester {
	public abstract ICadastro getAgendaConcret();

	@Test
	public void aAdicaoContagem(){
		ICadastro agendaTest = getAgendaConcret();
		agendaTest.resetAgenda(10);
		
		assertTrue(agendaTest.getContatos().size() == 0);
		assertTrue(agendaTest.adicionarContato("11110000", "Pedro Álvares"));
		assertTrue(agendaTest.adicionarContato("11110010", "Dom Pedro"));
		assertTrue(agendaTest.adicionarContato("11110020", "Rio Branco"));
		
		//Inserir Telefone Duplicado
		assertFalse(agendaTest.adicionarContato("11110020", "Rio Nilo"));
		
		assertTrue(agendaTest.getContatos().size() == 3);
		
		assertTrue(agendaTest.getContatoByTel("11110010")!=null);
		
		assertTrue(agendaTest.adicionarContato("22220000", "Pedro Álvares"));
		assertTrue(agendaTest.adicionarContato("33330000", "Pedro Álvares"));
		
		assertTrue(agendaTest.adicionarContato("22220010", "Dom Pedro"));
		assertTrue(agendaTest.adicionarContato("22220020", "Rio Branco"));
	}
	
	@Test
	public void bRemocaoListagem(){
		ICadastro agendaTest = getAgendaConcret();
		agendaTest.resetAgenda(4);
		
		assertTrue(agendaTest.adicionarContato("11110040", "Pedro Álvares"));
		assertTrue(agendaTest.adicionarContato("11110050", "Dom Pedro"));
		assertTrue(agendaTest.adicionarContato("11110060", "Floriano Peixoto"));
		
		//Remover contato existente e verificar quantidade de contatos
		assertTrue(agendaTest.removerContato("11110040"));
		assertTrue(agendaTest.getContatos().size()==2);
		
		//Remover contato nao existente e verificar quantidade de contatos
		assertFalse(agendaTest.removerContato("11118888"));
		assertTrue(agendaTest.getContatos().size()==2);
		
		assertTrue(agendaTest.adicionarContato("35420070", "Marechal Deororo"));
		assertTrue(agendaTest.adicionarContato("35480080", "Joaquim Manoel"));
		assertTrue(agendaTest.getContatos().size()==4);
		
		//Estourar Limite de Contatos
		assertFalse(agendaTest.adicionarContato("35410090", "Chico Xavier"));

		assertTrue(agendaTest.getContatos()!=null);
		
	}
	
	@Test
	public void cListasTelefones(){
		ICadastro agendaTest = getAgendaConcret();
		agendaTest.resetAgenda(10);
		
		assertTrue(agendaTest.getContatos().size() == 0);
		assertTrue(agendaTest.adicionarContato("11110000", "Pedro Álvares"));
		assertTrue(agendaTest.adicionarContato("11110010", "Dom Pedro"));
		assertTrue(agendaTest.adicionarContato("11110020", "Rio Branco"));
		
		assertTrue(agendaTest.getContatos().size() == 3);
		
		assertTrue(agendaTest.getContatoByTel("11110010")!=null);
		
		assertTrue(agendaTest.adicionarContato("22220000", "Pedro Álvares"));
		assertTrue(agendaTest.adicionarContato("33330000", "Pedro Álvares"));
		
		assertTrue(agendaTest.adicionarContato("22220010", "Dom Pedro"));
		assertTrue(agendaTest.adicionarContato("22220020", "Rio Branco"));
		
		//Quantidade de telefones do Pedro
		assertTrue(agendaTest.getTelefones("Pedro Álvares").size()==3);
		
		//Ronildo não tem telefone
		assertTrue(agendaTest.getTelefones("Ronildo Oliveira").size()==0);
	}

}