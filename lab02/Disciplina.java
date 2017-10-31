package lp2.lab02;

public class Disciplina {

	private String nomeDisciplina;
	

	private int horas;
	private double[] notas;
	private double media;
	private int[] pesos;

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
	}
	
	
	public Disciplina(int numero) {
		this.notas = new double[numero];
	}
	
	public Disciplina(int numero, int[] pesos) {
		this.notas = new double[numero];
		this.pesos = pesos;
	}
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	
	public void cadastraHoras(int horas) {
		this.horas = horas;
	}

	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
	}
	
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

	public String toString() {
		return "" + this.nomeDisciplina + " " + this.horas + " " + this.media + " " + "[" + this.notas[0] + ","
				+ this.notas[1] + "," + this.notas[2] + "," + this.notas[3] + "]";
	}

}
