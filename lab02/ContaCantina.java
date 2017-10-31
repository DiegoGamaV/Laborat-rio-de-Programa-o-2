package lp2.lab02;

public class ContaCantina {

	private String nomeDaCantina;
	private int quantidadeDeItens;
	private int valorCentavos;
	private String[] detalhes;

	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.detalhes = new String[5];
	}
	
	public String getNomeDaCantina() {
		return nomeDaCantina;
	}
	
	public void cadastraLanche(int qntdItens, int valorCentavos){
		this.quantidadeDeItens = qntdItens;
		this.valorCentavos = valorCentavos;
	}
	
	public void cadastrarLanche(int qntdItens, int valorCentavos, String detalhe){
		this.quantidadeDeItens = qntdItens;
		this.valorCentavos = valorCentavos;
		for (int i = this.detalhes.length - 1; i > 0; i--) {
			detalhes[i] = detalhes[i - 1];
		}
		detalhes[0] = detalhe;
	}
	
	public String listarDetalhes() {
		return this.detalhes.toString();
	}
	
	public void pagaConta(int valorCentavos){
		this.valorCentavos -= valorCentavos;
	}
	
	public String toString() {
		return "" + this.nomeDaCantina + " " + this.quantidadeDeItens + " " + this.valorCentavos;
	}
	
}
