/**
 * 
 */
package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab03.Contato;

/**
 * @author diegoag
 *
 */
public class ContatoTest {

	private Contato contatoTest1;
	private Contato contatoTest2;

	@Before
	public void createContatos() {
		contatoTest1 = new Contato("Mateus", "Gaudêncio", "2101-0000", 1);
		contatoTest2 = new Contato();
		contatoTest2.setNome("Mateus");
		contatoTest2.setSobrenome("Gaudêncio");
		contatoTest2.setTelefone("2101-0000");
	}

	@Test
	public void testSet() {
		String mensagem = "Esperando obter métodos iguais. contatoTest1 a partir do construtor, "
				+ "contatoTest2 a partir de settes";
		assertEquals(mensagem, contatoTest1, contatoTest2);
	}

	// Testes de Argumentos Nulos
	
	@Test(expected = NullPointerException.class)
	public void testContatoNullNome() {
		Contato contatoNull = new Contato(null, "Sobrenome", "(83) 99999-0000", 1);
	}
	
	@Test(expected = NullPointerException.class)
	public void testContatoNullSobrenome() {
		Contato contatoNull = new Contato("Nome", null, "(83) 99999-0000", 1);
	}
	
	// Testes de Argumentos Inválidos
	
	@Test(expected = IllegalArgumentException.class)
	public void testContatosNullNome() {
		Contato contatoSpace = new Contato(" ", "Sobrenome", "(83) 99999-0000", 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testContatosNullSobrenome() {
		Contato contatoSpace = new Contato("Nome", " ", "(83) 99999-0000", 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testContatosNullTelefone() {
		Contato contatoSpace = new Contato("Nome", "Sobrenome", " ", 1);
	}
	
	@Test
	public void testToString() {
		String mensagem = "Esperando obter a mesma descrição. A primeira através de inserção manual,"
				+ " e a segunda através do toString() de contatoTest1";
		String descricao = "Mateus Gaudêncio - 2101-0000";
		assertEquals(mensagem, descricao, contatoTest1.toString());
	}

}
