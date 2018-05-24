package lista07;


public class Mestre extends Jedi{
	private String dataPromocao;
	private boolean imortal;
	private int campoDeVisao;
	private Youngling aprendiz;
	
	Mestre(String nome, double vida) {
		this.addHabilidade(new Habilidade("sabre","estocada",100,0));
		this.addHabilidade(new Habilidade("sabre","corte",150,1));
		this.addHabilidade(new Habilidade("forca","empurra",200,2));
		this.addHabilidade(new Habilidade("forca","puxa",150,1));
		this.setNome(nome);
		this.setVida(vida);
	}
	
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
