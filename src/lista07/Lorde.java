package lista07;

public class Lorde extends Sith{
	private Aprendiz aprendiz; //não é lista pois há a primeira e única realidade dos Sith, só podem
								//haver dois em um determinado momento: um mestre e um aprendiz
	private int campoDeVisão;
	public Aprendiz getAprendiz() {
		return aprendiz;
	}
	public void setAprendiz(Aprendiz aprendiz) {
		this.aprendiz = aprendiz;
	}
	public int getCampoDeVisão() {
		return campoDeVisão;
	}
	public void setCampoDeVisão(int campoDeVisão) {
		this.campoDeVisão = campoDeVisão;
	}

}
