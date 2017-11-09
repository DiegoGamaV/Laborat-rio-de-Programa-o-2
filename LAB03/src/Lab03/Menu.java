package lab03;

public class Menu {
	
	public String opcoes() {
		String menu = "(C)adastrar Contato \n"
					+ "(L)istar Contato \n"
					+ "(E)xibir Contato"
					+ "(S)air";
		return menu;
	}
	
	public String selecao() {
		String menu = "Opção>";
		return menu;
	}

}
