/**
 * 
 */
package lp2.lab02;

/**
 * @author diegoag
 *
 */
public class Aluno {

	private String nome;
	private Disciplina[] disciplinas;
	private ContaLaboratorio[] contasLaboratorio;
	private ContaCantina[] contasCantina;
	private Saude saudeAtual;

	public Aluno() {
		disciplinas = new Disciplina[10];
		contasLaboratorio = new ContaLaboratorio[10];
		contasCantina = new ContaCantina[10];
		saudeAtual = new Saude();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void cadastraLaboratorio(String nomeLaboratorio) {
		ContaLaboratorio contaLaboratorio = new ContaLaboratorio(nomeLaboratorio);
		for (int i = this.contasLaboratorio.length - 1; i > 0; i--) {
			contasLaboratorio[i] = contasLaboratorio[i - 1];
		}
		contasLaboratorio[0] = contaLaboratorio;
	}

	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		ContaLaboratorio contaLaboratorio = new ContaLaboratorio(nomeLaboratorio, cota);
		for (int i = this.contasLaboratorio.length - 1; i > 0; i--) {
			contasLaboratorio[i] = contasLaboratorio[i - 1];
		}
		contasLaboratorio[0] = contaLaboratorio;
	}

	public void consomeEspaco(String nomeLaboratorio, int bytes) {
		for (int i = 0; i < contasLaboratorio.length; i++) {
			if (contasLaboratorio[i].getNomeLaboratorio().equals(nomeLaboratorio)) {
				contasLaboratorio[i].consomeEspaco(bytes);
			}
		}
	}

	public void liberaEspaco(String nomeLaboratorio, int bytes) {
		for (int i = 0; i < contasLaboratorio.length; i++) {
			if (contasLaboratorio[i].getNomeLaboratorio().equals(nomeLaboratorio)) {
				contasLaboratorio[i].liberaEspaco(bytes);
			}
		}
	}

	public boolean atingiuCota(String nomeLaboratorio) {
		ContaLaboratorio contaLaboratorio = null;
		for (int i = 0; i < contasLaboratorio.length; i++) {
			if (contasLaboratorio[i].getNomeLaboratorio().equals(nomeLaboratorio)) {
				contaLaboratorio = contasLaboratorio[i];
			}
		}
		return contaLaboratorio.atingiuCota();
	}

	public String laboratorioToString(String nomeLaboratorio) {
		ContaLaboratorio contaLaboratorio = null;
		for (int i = 0; i < contasLaboratorio.length; i++) {
			if (contasLaboratorio[i].getNomeLaboratorio().equals(nomeLaboratorio)) {
				contaLaboratorio = contasLaboratorio[i];
			}
		}
		return contaLaboratorio.toString();
	}

	public void cadastraDisciplina(String nomeDisciplina) {
		Disciplina disciplina = new Disciplina(nomeDisciplina);
		for (int i = this.disciplinas.length - 1; i > 0; i--) {
			disciplinas[i] = disciplinas[i - 1];
		}
		disciplinas[0] = disciplina;
	}

	public void cadastraHoras(String nomeDisciplina, int horas) {
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].getNomeDisciplina().equals(nomeDisciplina)) {
				disciplinas[i].cadastraHoras(horas);
			}
		}
	}

	public void cadastraNotas(String nomeDisciplina, int nota, double valorNota) {
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].getNomeDisciplina().equals(nomeDisciplina)) {
				disciplinas[i].cadastraNota(nota, valorNota);
				;
			}
		}
	}

	public boolean aprovado(String nomeDisciplina) {
		Disciplina disciplina = null;
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].getNomeDisciplina().equals(nomeDisciplina)) {
				disciplina = disciplinas[i];
			}
		}
		return disciplina.aprovado();
	}

	public String disciplinaToString(String nomeDisciplina) {
		Disciplina disciplina = null;
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].getNomeDisciplina().equals(nomeDisciplina)) {
				disciplina = disciplinas[i];
			}
		}
		return disciplina.toString();
	}

	public void cadastraCantina(String nomeCantina) {
		ContaCantina contaCantina = new ContaCantina(nomeCantina);
		for (int i = this.contasCantina.length - 1; i > 0; i--) {
			contasCantina[i] = contasCantina[i - 1];
		}
		contasCantina[0] = contaCantina;
	}

	public void cadastraLanche(String nomeCantina, int qntdItens, int valorCentavos) {
		for (int i = 0; i < this.contasCantina.length; i++) {
			if (contasCantina[i].getNomeDaCantina().equals(nomeCantina)) {
				contasCantina[i].cadastraLanche(qntdItens, valorCentavos);
			}
		}
	}

	public void pagarConta(String nomeCantina, int valorCentavos) {
		for (int i = 0; i < this.contasCantina.length; i++) {
			if (contasCantina[i].getNomeDaCantina().equals(nomeCantina)) {
				contasCantina[i].pagaConta(valorCentavos);
				;
			}
		}
	}

	public String cantinaToString(String nomeCantina) {
		ContaCantina contaCantina = null;
		for (int i = 0; i < contasCantina.length; i++) {
			if (contasCantina[i].getNomeDaCantina().equals(nomeCantina)) {
				contaCantina = contasCantina[i];
			}
		}
		return contaCantina.toString();
	}

	public void defineSaudeMental(String valor) {
		this.saudeAtual.defineSaudeMental(valor);
	}

	public void defineSaudeFisica(String valor) {
		this.saudeAtual.defineSaudeFisica(valor);
	}

	public String geral() {
		return this.saudeAtual.geral();
	}

}
