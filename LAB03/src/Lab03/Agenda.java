package lab03;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		this.contatos = new Contato[100];
	}

	public boolean setContato(String nome, String sobrenome, String telefone, int posicao) {
		Contato contato = new Contato(nome, sobrenome, telefone);
		posicao--;
		if (posicao <= -1 || posicao >= 101) {
			return false;
		} else {
			this.contatos[posicao] = contato;
			return true;
		}
	}

	public String getContato(int posicao) {
		return this.contatos[posicao].toString();
	}

	public String toString() {
		return contatos.toString();
	}
}
