package lista07;

public class Youngling extends Jedi{
	private Mestre mestre;
	private Clã clã;
	private boolean fezColheitaCristais;
	public Mestre getMestre() {
		return mestre;
	}
	public void setMestre(Mestre mestre) {
		this.mestre = mestre;
	}
	public Clã getClã() {
		return clã;
	}
	public void setClã(Clã clã) {
		this.clã = clã;
	}
	public boolean isFezColheitaCristais() {
		return fezColheitaCristais;
	}
	public void setFezColheitaCristais(boolean fezColheitaCristais) {
		this.fezColheitaCristais = fezColheitaCristais;
	}

}
