package lab03;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

	public Contato() {
		this.nome = "";
		this.sobrenome = "";
		this.telefone = "";
	}

	public Contato(String nome, String sobrenome, String telefone) {
		if (nome.equals(null) || sobrenome.equals(null)) {
			throw new NullPointerException();
		}
		if ((nome.equals("") || !(checkSpaces(nome))) || sobrenome.equals("") || !(checkSpaces(sobrenome))
				|| telefone.equals("") || !(checkSpaces(telefone))) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static boolean checkSpaces(String texto) {
		int count = 0;

		for (int i = 0; i < texto.length(); i++) {
			if (texto.matches(" ")) {
				count++;
			}
		}
		if (count == texto.length()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone;
	}

}
