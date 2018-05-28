package lista07;

public class Lorde extends Sith{
	private Aprendiz aprendiz; //n�o � lista pois h� a primeira e �nica realidade dos Sith, s� podem
								//haver dois em um determinado momento: um mestre e um aprendiz
	private int campoDeVisao;
	
	Lorde(String nome, double vida) {
		this.addHabilidade(new Habilidade("sabre","Mou kei (desmembramento múltiplo)",300,3));
		this.addHabilidade(new Habilidade("sabre","Sai cha (decaptação)",150,1));
		this.addHabilidade(new Habilidade("forca","Relâmpagos da Força",200,2));
		this.addHabilidade(new Habilidade("forca","Asfixia da Força",250,3));
		this.setNome(nome);
		this.setVida(vida);
	}
	
	public Aprendiz getAprendiz() {
		return aprendiz;
	}
	public void setAprendiz(Aprendiz aprendiz) {
		this.aprendiz = aprendiz;
	}
	public int getCampoDeVisao() {
		return campoDeVisao;
	}
	public void setCampoDeVisao(int campoDeVisao) {
		this.campoDeVisao = campoDeVisao;
	}

}
