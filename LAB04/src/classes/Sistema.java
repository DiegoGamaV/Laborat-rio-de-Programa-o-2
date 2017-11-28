package classes;

import java.util.Scanner;

public class Sistema {
	
	private static Sala sala = new Sala();
	
	public static void main(String[] args) {
		
		do {
			menu();
			Scanner scanner = new Scanner(System.in);
			String opcao = scanner.nextLine().toLowerCase();
			
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
			}
			
			
		} while();

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
		} else {
			System.out.println("MATRÍCULA JÁ CADASTRADA!");
		}
	}
	
	public static void exibirAluno(Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine();
		System.out.println("");
		System.out.println("Aluno: " + sala.consultarAluno(matricula).toString());
	}
	
	public static void novoGrupo(Scanner scanner) {
		System.out.print("Grupo: ");
		String nome = scanner.nextLine();
		if (sala.cadastrarGrupo(nome)) {
			System.out.println("CADASTRO REALIZADO!");
		} else {
			System.out.println("GRUPO JÁ CADASTRADO!");
		}
	}
	
	// fazer alocar aluno
	// chamar alocar ou imprimir de acordo com escolha do usuário
	public static void alocarOuImprimir(Scanner scanner) {
		System.out.print("(A)locar Aluno ou (I)mprimir Grupo? ");
		String escolha = scanner.nextLine();
		
	}
	
	// terminar imprimir grupo
	public static void imprimirGrupo(Scanner scanner) {
		System.out.print("Grupo: ");
		String nome = scanner.nextLine();
		System.out.println("");
	}
	
}
