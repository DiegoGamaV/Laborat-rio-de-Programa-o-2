package classes;

import java.util.HashSet;

public class GrupoEstudo {

	private String nome;
	private HashSet<Aluno> alunos = new HashSet<>();

	public GrupoEstudo(String nome) {
		super();
		if (nome == null) {
			throw new NullPointerException();
		} else if (nome.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		GrupoEstudo other = (GrupoEstudo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String impressao = "Alunos do grupo" + this.nome + ":" + System.lineSeparator();
		for (Aluno aluno : alunos) {
			impressao = impressao + "* " + aluno.toString() + System.lineSeparator();
		}
		return impressao;
	}

}
