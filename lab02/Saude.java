package lp2.lab02;

/**
 * <h1>Saude</h1> A classe Saude abstrai as condições mentais e físicas de um
 * Aluno.
 *
 * @author Diego Alves Gama
 * @version 1.2
 * @since 26/10/2017
 */

public class Saude {

	/**
	 * Os objetos mental e fisica devem assumir apenas dois possibilidades de
	 * valores: "boa" e "fraca". O objeto emoji deve assumir qualquer valor
	 * representando um emoji de texto.
	 */
	private String mental;
	private String fisica;
	private String emoji;

	/**
	 * Método construtor. Define por padrão a saúde física e mental como boa.
	 */

	public Saude() {
		this.mental = "boa";
		this.fisica = "boa";
	}

	/**
	 * Método usado para definir a saúde mental
	 * 
	 * @param valor
	 *            Valor a ser atribuido a mental.
	 * @return void.
	 */

	public void defineSaudeMental(String valor) {
		this.mental = valor;
	}

	/**
	 * Método usado para definir a saúde física
	 * 
	 * @param valor
	 *            Valor a ser atribuido a fisica.
	 * @return void.
	 */

	public void defineSaudeFisica(String valor) {
		this.fisica = valor;
	}

	/**
	 * Método usado para definir como o aluno se sente no momento
	 * 
	 * @param valor
	 *            Valor a ser atribuido a emoji.
	 * @return void.
	 */

	public void definirEmoji(String valor) {
		this.emoji = valor;
	}

	/**
	 * Método toString.
	 * 
	 * @param Unused
	 * @return String A descrição da saúde do aluno.
	 */

	public String geral() {
		if (this.mental.equals("boa") && this.fisica.equals("boa")) {
			return "boa" + " " + this.emoji;
		} else if ((this.mental.equals("boa") && this.fisica.equals("fraca"))
				|| ((this.mental.equals("fraca") && this.fisica.equals("boa")))) {
			return "ok" + " " + this.emoji;
		} else {
			return "fraca" + " " + this.emoji;
		}
	}

}
