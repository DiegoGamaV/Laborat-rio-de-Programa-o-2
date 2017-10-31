package lp2.lab02;

/**
 * <h1>ContaCantina</h1> A classe ContaCantina abstrai a conta de um Aluno na
 * cantina da Instituição.
 *
 * @author Diego Alves Gama
 * @version 1.2
 * @since 26/10/2017
 */

public class ContaCantina {

	// O objeto nomeDaCantina representa o nome da cantina frequentada
	private String nomeDaCantina;
	// A variável quantidadeDeItens representa a quantidade de itens consumidos
	private int quantidadeDeItens;
	// A variável valorCentavos representa o preço total de itens consumidos em
	// centavos que ainda deverá ser pago
	private int valorCentavos;
	// O array detalhes representa um arranjo de comentários sobre o lanche
	// consumido
	private String[] detalhes;

	// Método construtor para apenas o nome da cantina
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.detalhes = new String[5];
	}

	public String getNomeDaCantina() {
		return nomeDaCantina;
	}

	/**
	 * Método usado para cadastrar um lanche consumido
	 * 
	 * @param qntdItens
	 *            Quantidade de itens consumidos no lanche.
	 * @param valorCentavos
	 *            Valor em centavos de todo o consumo.
	 * @return void.
	 */

	public void cadastraLanche(int qntdItens, int valorCentavos) {
		this.quantidadeDeItens = qntdItens;
		this.valorCentavos = valorCentavos;
	}

	/**
	 * Método usado para cadastrar um lanche consumido
	 * 
	 * @param qntdItens
	 *            Quantidade de itens consumidos no lanche.
	 * @param valorCentavos
	 *            Valor em centavos de todo o consumo.
	 * @param detalhe
	 *            Comentário acerta do lanche consumido.
	 * @return void.
	 */

	public void cadastrarLanche(int qntdItens, int valorCentavos, String detalhe) {
		this.quantidadeDeItens = qntdItens;
		this.valorCentavos = valorCentavos;
		for (int i = this.detalhes.length - 1; i > 0; i--) {
			detalhes[i] = detalhes[i - 1];
		}
		detalhes[0] = detalhe;
	}

	/**
	 * Método usado para efetuar o pagamento da conta.
	 * 
	 * @param valorCentavos
	 *            Valor a ser pago e decrementado do valor restante a ser pago.
	 * @return void.
	 */

	public void pagaConta(int valorCentavos) {
		this.valorCentavos -= valorCentavos;
	}

	/**
	 * Método usado para listar todos os comentários realizados
	 * 
	 * @param Unused
	 * @return String.
	 */

	public String listarDetalhes() {
		return this.detalhes.toString();
	}

	/**
	 * Método toString
	 * 
	 * @param Unused
	 * @return String.
	 */

	public String toString() {
		return "" + this.nomeDaCantina + " " + this.quantidadeDeItens + " " + this.valorCentavos;
	}

}
