package lista07;

public class Planeta {
	private String nome;
	private Sistema sistema;
	private String cor;
	private double diametro;
	private String capital;
	private RegimePolitico regime;
	
	public RegimePolitico getRegime() {
		return regime;
	}
	public void setRegime(RegimePolitico regime) {
		this.regime = regime;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sistema getSistema() {
		return sistema;
	}
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}

}
