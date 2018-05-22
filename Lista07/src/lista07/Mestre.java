package lista07;

public class Mestre extends Jedi{
	private String dataPromocao;
	private boolean imortal;
	private int campoDeVisao;
	private Youngling aprendiz;
	public String getDataPromocao() {
		return dataPromocao;
	}
	public void setDataPromocao(String dataPromocao) {
		this.dataPromocao = dataPromocao;
	}
	public boolean isImortal() {
		return imortal;
	}
	public void setImortal(boolean imortal) {
		this.imortal = imortal;
	}
	public int getCampoDeVisao() {
		return campoDeVisao;
	}
	public void setCampoDeVisao(int campoDeVisao) {
		this.campoDeVisao = campoDeVisao;
	}
	public Youngling getAprendiz() {
		return aprendiz;
	}
	public void setAprendiz(Youngling aprendiz) {
		this.aprendiz = aprendiz;
	}

}
