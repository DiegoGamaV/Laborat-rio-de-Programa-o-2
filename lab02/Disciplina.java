package lp2.lab02;

/**
 * <h1>Disciplina</h1> A classe Disciplina abstrai disciplinas cursadas por um
 * Aluno.
 *
 * @author Diego Alves Gama
 * @version 1.2
 * @since 26/10/2017
 */

public class Disciplina {

	// O objeto nomeDisciplina representa o nome da disciplina cursada.
	private String nomeDisciplina;
	// O array horas representa a carga horária da disciplina.
	private int horas;
	// O array notas representa as notas conquistadas em cada avaliação.
	private double[] notas;
	// A variável media representa a média final das notas.
	private double media;
	// O array pesos representa o peso de cada nota.
	private int[] pesos;

	// Método construtor apenas para o nome da disciplina
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
	}

	// Método construtor apenas para a quantidade de notas
	public Disciplina(int numero) {
		this.notas = new double[numero];
	}

	// Método construtor para quantidade de notas com pesos distintos
	public Disciplina(int numero, int[] pesos) {
		this.notas = new double[numero];
		this.pesos = pesos;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	/**
	 * Método usado para cadastrar horas.
	 * 
	 * @param horas
	 *            Valor da carga horária.
	 * @return void.
	 */

	public void cadastraHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * Método usado para cadastrar notas.
	 * 
	 * @param nota
	 *            Identificador da nota a ser atribuida.
	 * @param valorNota
	 *            Valor da nota conseguida.
	 * @return void.
	 */

	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
	}

	/**
	 * Método usado para calcular média ponderada e checar aprovação do Aluno.
	 * 
	 * @param pesos
	 *            Array de pesos de cada uma das notas.
	 * @return boolean.
	 */

	public boolean aprovado(int[] pesos) {
		double total = 0;
		int somaPesos = 0;
		for (int i = 0; i < notas.length; i++) {
			total = total + notas[i] * pesos[i];
			somaPesos += pesos[i];
		}
		this.media = total / somaPesos;

		if (this.media >= 7.0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método usado para calcular média e checar aprovação do Aluno.
	 * 
	 * @return boolean.
	 */

	public boolean aprovado() {
		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		this.media = total / 4;

		if (this.media >= 7.0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método toString
	 * 
	 * @return String.
	 */

	public String toString() {
		return "" + this.nomeDisciplina + " " + this.horas + " " + this.media + " " + "[" + this.notas[0] + ","
				+ this.notas[1] + "," + this.notas[2] + "," + this.notas[3] + "]";
	}

}
