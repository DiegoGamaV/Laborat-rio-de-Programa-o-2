package classes;

import java.util.Scanner;

public class Sistema {
	
	private static Sala sala = new Sala();
	
	public static void main(String[] args) {
		
		String opcao = "";
		
		do {
			System.out.println(menu());
			Scanner scanner = new Scanner(System.in);
			System.out.print("Opcao> ");
			opcao = scanner.nextLine().toLowerCase();
			
			switch(opcao) {
			case "c": 
				cadastrarAluno(scanner);
				break;
			case "e":
				exibirAluno(scanner);
				break;
			case "n":
				novoGrupo(scanner);
				break;
			case "a":
				alocarOuImprimir(scanner);
				break;
			case "r":
				registrarResposta(scanner);
				break;
			case "i":
				imprimirParticipantes(scanner);
				break;
			case "o":
				System.out.println("FIM DO PROGRAMA!");
				break;
			default:
				System.out.println("Entrada Inválida.");
				break;
			}
			
		} while(!opcao.equals("o"));

	}

	public static String menu() {
		String menu = "(C)adastrar Aluno" + System.lineSeparator() +
					  "(E)xibir Aluno" + System.lineSeparator() +
					  "(N)ovo Grupo" + System.lineSeparator() +
					  "(A)locar Aluno no Grupo e Imprimir Grupos" + System.lineSeparator() +
					  "(R)egistrar Resposta de Aluno" + System.lineSeparator() +
					  "(I)mprimir Alunos que Responderam" + System.lineSeparator() +
					  "(O)ra, vamos fechar o programa!" + System.lineSeparator();
		return menu;
	}
	
	public static void cadastrarAluno(Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine();
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Curso: ");
		String curso = scanner.nextLine();
		if (sala.cadastrarAluno(matricula, nome, curso)) {
			System.out.println("CADASTRO REALIZADO!");
			System.out.println("");
		} else {
			System.out.println("MATRÍCULA JÁ CADASTRADA!");
			System.out.println("");
		}
	}
	
	public static void exibirAluno(Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine();
		System.out.println("");
		Aluno aluno = sala.consultarAluno(matricula);
		if (aluno != null) {
			System.out.println("Aluno: " + sala.consultarAluno(matricula).toString());
			System.out.println("");			
		} else {
			System.out.println("Aluno não cadastrado.");
			System.out.println("");
		}
	}
	
	public static void novoGrupo(Scanner scanner) {
		System.out.print("Grupo: ");
		String nome = scanner.nextLine();
		if (sala.cadastrarGrupo(nome)) {
			System.out.println("CADASTRO REALIZADO!");
			System.out.println("");
		} else {
			System.out.println("GRUPO JÁ CADASTRADO!");
			System.out.println("");
		}
	}
	
	// fazer alocar aluno
	// chamar alocar ou imprimir de acordo com escolha do usuário
	public static void alocarOuImprimir(Scanner scanner) {
		System.out.print("(A)locar Aluno ou (I)mprimir Grupo? ");
		String escolha = scanner.nextLine();
		if (escolha.toLowerCase().equals("a")) {
			alocarAluno(scanner);
		} else if (escolha.toLowerCase().equals("i")) {
			imprimirGrupo(scanner);
		}
	}
	
	public static void imprimirGrupo(Scanner scanner) {
		System.out.print("Grupo: ");
		String nome = scanner.nextLine();
		System.out.println("");
		GrupoEstudo grupo = sala.consultarGrupo(nome);
		if (grupo == null) {
			System.out.println("Grupo não cadastrado.");
			System.out.println("");
		} else {			
			System.out.println(grupo.toString());
			System.out.println("");
		}
	}
	
	public static void alocarAluno(Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine();
		System.out.print("Grupo: ");
		String nome = scanner.nextLine();
		Aluno aluno = sala.consultarAluno(matricula);
		GrupoEstudo grupo = sala.consultarGrupo(nome);
		if (aluno == null) {
			System.out.println("Aluno não cadastrado.");
			System.out.println("");
		} else 	if (grupo == null) {
			System.out.println("Grupo não cadastrado.");
			System.out.println("");
		} else {
			grupo.addAluno(aluno);
			System.out.println("");
		}
	}
	
	public static void registrarResposta(Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine();
		Aluno aluno = sala.consultarAluno(matricula);
		if (aluno == null) {
			System.out.println("Aluno não cadastrado.");
			System.out.println("");
		} else {
			sala.cadastrarParticipantes(matricula);
			System.out.println("");
		}
	}
	
	public static void imprimirParticipantes(Scanner scanner) {
		System.out.println(sala.imprimirParticipantes());
		System.out.println("");
	}
	
}
