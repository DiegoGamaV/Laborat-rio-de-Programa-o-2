package lp2.lab02;

public class Saude {

	private String mental;
	private String fisica;
	private String emoji;

	public Saude() {

	}

	public void defineSaudeMental(String valor) {
		this.mental = valor;
	}

	public void defineSaudeFisica(String valor) {
		this.fisica = valor;
	}
	
	public void definirEmoji(String valor) {
		this.emoji = valor;
	}

	public String geral() {
		if (this.mental.equals("boa") && this.fisica.equals("boa")) {
			return "boa" + "" + this.emoji;
		} else if ((this.mental.equals("boa") && this.fisica.equals("fraca"))
				|| ((this.mental.equals("fraca") && this.fisica.equals("boa")))) {
			return "ok" + "" + this.emoji;
		} else if (this.fisica.equals("fraca") && this.fisica.equals("fraca")) {
			return "fraca" + "" + this.emoji;
		}
		return null;
	}

}
