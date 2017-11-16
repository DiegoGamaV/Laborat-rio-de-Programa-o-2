package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemporadaTest {

	private Bluray episodio1;
	private Bluray episodio2;
	private Bluray episodio3;
	private Temporada temporadaA;
	private Temporada temporadaB;
	private Temporada temporadaC;

	@Before
	public void criarTemporadas() {
		temporadaA = new Temporada("How to Get Away With Muder - Season 1", 4);
		temporadaB = new Temporada("Grimm - Season 4", 3);
		temporadaC = new Temporada("House of Cards - Season 2", 1);
		episodio1 = new Bluray("Piloto", 55);
		episodio2 = new Bluray("Running Away", 60);
		episodio3 = new Bluray("Go Fork Yourselk", 53);
		temporadaA.adicionaBluRay(episodio1);
		temporadaA.adicionaBluRay(episodio2);
		temporadaA.adicionaBluRay(episodio3);
		temporadaB.adicionaBluRay(episodio1);
		temporadaB.adicionaBluRay(episodio2);
		temporadaB.adicionaBluRay(episodio3);
	}

	@Test
	public void testarPoucoPopular() {
		temporadaA.aumentaPopularidade();
		String mensagem = "Esperando 'POUCO POPULAR'.";
		assertEquals(mensagem, "POUCO POPULAR", temporadaA.getPopularidade());
	}

	@Test
	public void testarPopular() {
		for (int i = 0; i < 11; i++) {
			temporadaB.aumentaPopularidade();
		}
		String mensagem = "Esperando 'POPULAR'.";
		assertEquals(mensagem, "POPULAR", temporadaB.getPopularidade());
	}

	@Test
	public void testarMuitoPopular() {
		for (int i = 0; i < 31; i++) {
			temporadaC.aumentaPopularidade();
		}
		String mensagem = "Esperando 'MUITO POPULAR'.";
		assertEquals(mensagem, "MUITO POPULAR", temporadaC.getPopularidade());
	}

	@Test
	public void testarDuracaoTotal() {
		String mensagem = "Esperando igualdade entre os valores.";
		assertEquals(mensagem, 168, temporadaB.duracaoTotal());
	}

	@Test
	public void testarBlurayAdicionado() {
		String mensagem = "Esperando que após a inserção o episódio esteja incluso na temporada.";
		Bluray episodio4 = new Bluray("The Man and the Golden Statue", 59);
		assertTrue(mensagem, temporadaA.adicionaBluRay(episodio4));
	}

	@Test
	public void testarDescricaoBluray() {
		String mensagem = "Esperando que a descrição do bluray consultado seja a mesma que a passada.";
		assertEquals(mensagem, "Título: Piloto, Duração: 55", temporadaA.listaBluray("Piloto"));
	}

}
