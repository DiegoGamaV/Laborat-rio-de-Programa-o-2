package classes;

public class Temporada {

	private String titulo;
	private Bluray[] episodios;
	private int popularidade;

	public Temporada(String titulo, int episodios) {
		this.titulo = titulo;
		this.episodios = new Bluray[episodios];
		this.popularidade = 0;
	}

	public Temporada(int episodios) {
		this.episodios = new Bluray[episodios];
		this.popularidade = 0;
	}

	public int duracaoTotal() {
		int soma = 0;
		for (int i = 0; i < tamanhoOcupado(); i++) {
			soma += episodios[i].getDuracao();
		}
		return soma;
	}

	public boolean adicionaBluRay(Bluray bd) {
		try {
			episodios[tamanhoOcupado() + 1] = bd;
			return true;
		} catch(Exception e) {
			return false;
		}
	}

	public String listaBluray(String titulo) {
		for (int i = 0; i < tamanhoOcupado(); i++) {
			if (episodios[i].getTitulo().equals(titulo)) {
				return episodios[i].toString();
			}
		}
		return null;
	}

	public String getPopularidade() {
		if (this.popularidade <= 10) {
			return "POUCO POPULAR";
		} else {
			if (this.popularidade <= 30) {
				return "POPULAR";
			} else {
				return "MUITO POPULAR";
			}
		}
	}

	public void aumentaPopularidade() {
		this.popularidade++;
	}

	public int tamanhoOcupado() {
		int tamanho = 0;
		while (true) {
			if (episodios[tamanho] == null) {
				return tamanho;
			} else {
				tamanho++;
			}
		}
	}
}
