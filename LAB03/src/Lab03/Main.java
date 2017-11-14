package lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Agenda agenda = new Agenda();

	public static void main(String[] args) {

		String opcao = "";
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println(opcoes());
			System.out.print("Opção> ");
			opcao = scanner.nextLine();
			switch (opcao.toLowerCase()) {

			case "c":
				cadastrar();
				break;
			case "l":
				listarContatos();
				break;
			case "e":
				exibirContato();
				break;
			case "s":
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
			}
		} while (!opcao.equals("S"));
		
	scanner.close();
	
	}

	public static String opcoes() {
		String menu = "(C)adastrar Contato"
				+ " \n(L)istar Contatos"
				+ " \n(E)xibir Contato"
				+ " \n(S)air \n";
		return menu;
	}

	public static void cadastrar() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Posição: ");
		int posicao = scanner.nextInt();
		String cleaner = scanner.nextLine();
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Sobrenome: ");
		String sobrenome = scanner.nextLine();
		System.out.print("Telefone: ");
		String telefone = scanner.nextLine();
		agenda.setContato(nome, sobrenome, telefone, posicao);
		System.out.println("CADASTRO REALIZADO!");
		System.out.println("");
	}

	public static void listarContatos() {
		ArrayList<String> lista = agenda.listarContatos();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	public static void exibirContato() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Contato> ");
		int posicao = scanner.nextInt();
		System.out.println("");
		System.out.println(agenda.getContato(posicao));
	}
	
}
