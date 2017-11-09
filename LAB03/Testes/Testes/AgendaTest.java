package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab03.Agenda;
import lab03.Contato;

public class AgendaTest {
	
	private Agenda agendaTest;
	private Contato[] contatos;
	
	@Before
	public void createContatos(){
		agendaTest = new Agenda();
		contatos = new Contato[100];
		agendaTest.setContato("Diego", "Gama", "9999-9999", 2);
		contatos[2] = new Contato("Diego", "Gama", "9999-9999");
		agendaTest.setContato("Lorena", "Nascimento", "0000-0000", 3);
		contatos[3] = new Contato("Lorena", "Nascimento", "0000-0000");
	}
	
	// Teste de Criação de Contatos 
	
	@Test
	public void testContatoEmptyPosition() {
		String mensagem = "Esperando um resultado True. Tentando criar um contato em posição desocupada";
		contatos[1] = new Contato("John", "Doe", "(83) 99999-0000");
		assertTrue(agendaTest.setContato("John", "Doe", "(83) 99999-0000", 1));
	}
	
	@Test
	public void testContatoOccupiedPosition() {
		String mensagem = "Esperando um resultado True. Tentando sobrescrever contato em posição ocupada";
		contatos[2] = new Contato("Jane", "Doe", "(83) 99999-0000");
		assertTrue(mensagem, agendaTest.setContato("Jane", "Doe", "(83) 99999-0000", 2));
	}
	
	@Test
	public void testContatoInvalidPosition() {
		String mensagem1 = "Esperando um resultado False. Tentando cadastrar contato em posição inválida 0";
		assertFalse(mensagem1, agendaTest.setContato("Gertrude", "Gais", "(83) 12345-0000", 0));
		String mensagem2 = "Esperando um resultado False. Tentando cadastrar contato em posição inválida 101";
		assertFalse(mensagem2, agendaTest.setContato("Eldon", "Ericksen", "(83) 67891-0000", 101));
	}
	
	@Test
	public void testContatoExtremePosition() {
		String mensagem = "Esperando um resultado True. Tentando sobrescrever contato em posição crítica 100";
		contatos[100] = new Contato("Danny", "Dugas", "(83) 4040-21212");
		assertTrue(mensagem, agendaTest.setContato("Danny", "Dugas", "(83) 4040-21212", 100));
	}
	
	// Teste do toString()
	
	@Test
	public void testToString() {
		String mensagem = "Esperando igualdade entre as descrições. ToString() manual, e depois toString() de Agenda";
		assertEquals(mensagem, contatos.toString(), agendaTest.toString());
	}
	
}
