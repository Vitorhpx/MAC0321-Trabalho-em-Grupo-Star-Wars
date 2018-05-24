package lista07;

import java.util.ArrayList;
import java.util.List;

public abstract class UsuarioDaForca extends Ser{
	
	private double percentualAlinhamento; //representa raiva para Siths e paz interna para Jedis
	private List<Poder> poderes = new ArrayList<Poder>();
	private List<SabreDeLuz> sabres = new ArrayList<SabreDeLuz>(); //existiam usuarios que possuiam mais de um sabre
	public double getPercentualAlinhamento() {
		return percentualAlinhamento;
	}
	public void setPercentualAlinhamento(double percentualAlinhamento) {
		this.percentualAlinhamento = percentualAlinhamento;
	}
	public List<Poder> getPoderes() {
		return poderes;
	}
	public void setPoderes(ArrayList<Poder> poderes) {
		this.poderes = poderes;
	}
	public List<SabreDeLuz> getSabres() {
		return sabres;
	}
	public void setSabres(ArrayList<SabreDeLuz> sabres) {
		this.sabres = sabres;
	}
	
}
