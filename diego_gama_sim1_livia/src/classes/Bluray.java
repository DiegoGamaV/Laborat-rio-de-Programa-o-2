package classes;

public class Bluray {

	private String titulo;
	private int duracao;

	public Bluray(String titulo, int duracao) {
		if (isIlegal(titulo, duracao)) {
			throw new IllegalArgumentException();
		} else {
			if (isNulo(titulo)) {
				throw new NullPointerException();
			}
		}
		this.titulo = titulo;
		this.duracao = duracao;
	}

	public Bluray(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getDuracao() {
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public boolean isIlegal(String titulo, int duracao) {
		if (titulo.trim().equals("")) {
			return true;
		} else {
			if (duracao <= 0) {
				return true;
			}
		}	
		return false;
	}
	
	public boolean isNulo(String titulo) {
		if (titulo.equals(null)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bluray other = (Bluray) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + ", Duração: " + duracao;
	}

}
