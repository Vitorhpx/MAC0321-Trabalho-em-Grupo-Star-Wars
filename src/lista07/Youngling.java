package lista07;

public class Youngling extends Jedi{
	private Mestre mestre;
	private Cla cla;
	private boolean fezColheitaCristais;
	public Mestre getMestre() {
		return mestre;
	}
	public void setMestre(Mestre mestre) {
		this.mestre = mestre;
	}
	public Cla getCla() {
		return cla;
	}
	public void setCla(Cla cla) {
		this.cla = cla;
	}
	public boolean isFezColheitaCristais() {
		return fezColheitaCristais;
	}
	public void setFezColheitaCristais(boolean fezColheitaCristais) {
		this.fezColheitaCristais = fezColheitaCristais;
	}

}
