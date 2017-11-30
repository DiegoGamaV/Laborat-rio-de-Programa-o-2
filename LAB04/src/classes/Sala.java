package classes;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Diego Gama
 *	Classe que representa uma Sala de Aula.
 */
public class Sala {

	private ArrayList<Aluno> cadastrados = new ArrayList<>();
	private ArrayList<Aluno> participantes = new ArrayList<>();
	private HashSet<GrupoEstudo> grupos = new HashSet<>();

	public Sala() {

	}
	/**
	 * @method Método responsável por cadastrar um aluno na sala de áula
	 * @param matricula
	 * 			Matrícula do aluno
	 * @param nome
	 * 			Nome do aluno
	 * @param curso
	 * 			Curso do aluno
	 * @return 
	 */
	public boolean cadastrarAluno(String matricula, String nome, String curso) {
		if (consultarAluno(matricula) != null) {
			Aluno aluno = new Aluno(matricula, nome, curso);
			cadastrados.add(aluno);
			return true;
		} else {
			return false;
		}
	}

	public Aluno consultarAluno(String matricula) {
		for (int i = 0; i < cadastrados.size(); i++) {
			if (cadastrados.get(i).getMatricula().equals(matricula)) {
				return cadastrados.get(i);
			}
		}
		return null;
	}

	public boolean cadastrarGrupo(String nome) {
		if (consultarGrupo(nome) == null) {
			GrupoEstudo grupo = new GrupoEstudo(nome);
			grupos.add(grupo);
			return true;
		} else {
			return false;
		}
	}

	public GrupoEstudo consultarGrupo(String nome) {
		for (GrupoEstudo grupo : grupos) {
			if (nome.toLowerCase().equals(grupo.getNome().toLowerCase())) {
				return grupo;
			}
		}
		return null;
	}

	public String alocarAluno(String matricula, String nome) {
		if (consultarAluno(matricula) == null) {
			return "Aluno não cadastrado.";
		} else if (consultarGrupo(nome) == null) {
			return "Grupo não cadastrado.";
		} else {
			consultarGrupo(nome).addAluno(consultarAluno(matricula));
			return "ALUNO ALOCADO!";
		}
	}

	public String imprimirGrupos(String nome) {
		if (consultarGrupo(nome) == null) {
			return "Grupo não cadastrado.";
		} else {
			return consultarGrupo(nome).toString();
		}
	}
	
	public boolean cadastrarParticipantes(String matricula) {
		if (consultarAluno(matricula) == null) {
			return false;
		} else {
			participantes.add(consultarAluno(matricula));
			return true;
		}
	}
	
	public String imprimirParticipantes() {
		String impressao = "Alunos:" + System.lineSeparator();
		for (int i = 0; i < participantes.size(); i++) {
			impressao = impressao + (i + 1) + ". " + participantes.get(i).toString() + System.lineSeparator();
		}
		return impressao;
	}
}
