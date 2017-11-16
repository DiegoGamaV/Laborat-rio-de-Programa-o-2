package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BlurayTest {
	
	private Bluray bluray1;
	private Bluray bluray2;	
	
	@Before
	public void criarBluray() {
		bluray1 = new Bluray("O Senhor dos Aneis", 180);
		bluray2 = new Bluray("O Senhor dos Aneis", 40);
	}
	
	@Test
	public void compararBluray() {
		String mensagem = "Esperando que os dois blurays sejam iguais.";
		assertTrue(mensagem, bluray1.equals(bluray2));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criarTituloVazio() {
		Bluray blurayIlegal = new Bluray("", 60);
	}
	
	@Test(expected = NullPointerException.class)
	public void criarTituloNulo() {
		Bluray blurayIlegal = new Bluray(null, 90);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criarDuracaoNegativa() {
		Bluray blurayIlegal = new Bluray("Piratas do Caribe", -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void criarDuracaoNula() {
		Bluray blurayIlegal = new Bluray("A Ilha do Medo", 0);
	}
	
	public void comparaDescricoes() {
		bluray2.setDuracao(180);
		String mensagem = "Esperando que as descrições sejam iguais.";
		assertEquals(mensagem, bluray1.toString(), bluray2.toString());
	}
	
}
