package classes;

/**
 * @author Diego Gama 
 * Classe utilizada para representar um aluno no sistema.
 */
public class Aluno {

	private String matricula;
	private String nome;
	private String curso;

	public Aluno(String matricula, String nome, String curso) {
		if (!isValido(matricula, nome, curso)) {
			throw new IllegalArgumentException();
		}
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * @method Método que valida se os argumentos são vazios ou nulos.
	 * 
	 * @param matricula
	 *            matricula a ser testada
	 * @param nome
	 *            nome a ser testado
	 * @param curso
	 *            curso a ser testado
	 * @return a validade dos argumentos.
	 */
	public boolean isValido(String matricula, String nome, String curso) {
		if (matricula == null || nome == null || curso == null) {
			return false;
		} else if (matricula.isEmpty() || nome.isEmpty() || curso.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	public String toString() {
		return this.matricula.trim() + " - " + this.nome.trim() + " - " + this.curso.trim();
	}

}
