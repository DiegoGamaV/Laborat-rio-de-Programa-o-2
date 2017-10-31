package lp2.lab02;

/**
 * <h1>ContaLaboratorio</h1> A classe ContaLaboratorio abstrai contas cadastradas de
 * um Aluno em um Laboratório.
 *
 * @author Diego Alves Gama
 * @version 1.2
 * @since 26/10/2017
 */

public class ContaLaboratorio {

	// A variável cota representa o valor máximo de dados a armazenado
	private int cota;
	// A variável espacoOcupado representa a quantidade de dados já ocupada
	private int espacoOcupado;
	// O objeto nomeLaboratorio representa o nome do laboratório
	private String nomeLaboratorio;

	// Método construtor para nome e cota personalizada
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.cota = cota;
		this.nomeLaboratorio = nomeLaboratorio;
	}

	// Método construtor para apenas o nome do laboratório
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}

	public String getNomeLaboratorio() {
		return nomeLaboratorio;
	}

	/**
	 * Método usado para aumentar a quantidade de dados consumidos.
	 * 
	 * @param mbytes
	 *            Quantidade dos dados em Mega Bytes .
	 * @return void.
	 */

	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;

	}

	/**
	 * Método usado para diminuir a quantidade de dados consumidos.
	 * 
	 * @param mbytes
	 *            Quantidade dos dados em Mega Bytes .
	 * @return void.
	 */

	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;

	}

	/**
	 * Método usado para avaliar se a conta do aluno já atingiu a cota de
	 * armazenamento disponível.
	 * 
	 * @param Unused
	 * 
	 * @return boolean.
	 */

	public boolean atingiuCota() {
		if (this.espacoOcupado >= this.cota) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método usado para aumentar a quantidade de dados consumidos.
	 * 
	 * @param Unused
	 * @return String .
	 */

	public String toString() {
		return "" + this.nomeLaboratorio + " " + this.espacoOcupado + "/" + this.cota;
	}

}
