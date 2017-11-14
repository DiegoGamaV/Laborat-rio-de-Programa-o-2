package lab03;

import java.util.ArrayList;
import java.util.Arrays;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		this.contatos = new Contato[100];
	}

	public boolean setContato(String nome, String sobrenome, String telefone, int posicao) {
		Contato contato = new Contato(nome, sobrenome, telefone, posicao);
		posicao = posicao - 1 ;
		if (posicao <= -1 || posicao >= 100) {
			return false;
		} else {
			this.contatos[posicao] = contato;
			return true;
		}
	}
	
	public String getContato(int posicao) {
		return this.contatos[posicao - 1].toString();
	}
	
	public ArrayList<String> listarContatos() {
		ArrayList<String> lista = new ArrayList<String>();
		for (int i = 0; i < contatos.length; i++) {
			if (this.contatos[i] != null) {
				lista.add(this.contatos[i].toString());
			}
		}
		return lista;
	}
	
	public String toString() {
		return Arrays.toString(this.contatos);
	}
}
