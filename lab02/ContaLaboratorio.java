package lp2.lab02;

public class ContaLaboratorio {

	private int cota;
	private int espacoOcupado;
	private String nomeLaboratorio;

	public String getNomeLaboratorio() {
		return nomeLaboratorio;
	}

	public void setNomeLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}

	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.cota = cota;
		this.nomeLaboratorio = nomeLaboratorio;
	}

	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}

	public void consomeEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;

	}

	public void liberaEspaco(int mbytes) {
		this.espacoOcupado += mbytes;

	}

	public boolean atingiuCota() {
		if (this.espacoOcupado >= this.cota) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		return "" + this.nomeLaboratorio + " " + this.espacoOcupado + "/" + this.cota;
	}

}
