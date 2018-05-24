package lista07;

public class Lorde extends Sith{
	private Aprendiz aprendiz; //n�o � lista pois h� a primeira e �nica realidade dos Sith, s� podem
								//haver dois em um determinado momento: um mestre e um aprendiz
	private int campoDeVisao;
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
