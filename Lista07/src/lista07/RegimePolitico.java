package lista07;

import java.util.ArrayList;
import java.util.List;

public class RegimePolitico {
	private String nome;
	private Planeta capital;
	private Ser chefeDeEstado;
	private List<Planeta> planetasControlados = new ArrayList<Planeta>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Planeta getCapital() {
		return capital;
	}
	public void setCapital(Planeta capital) {
		this.capital = capital;
	}
	public Ser getChefeDeEstado() {
		return chefeDeEstado;
	}
	public void setChefeDeEstado(Ser chefeDeEstado) {
		this.chefeDeEstado = chefeDeEstado;
	}
	public List<Planeta> getPlanetasControlados() {
		return planetasControlados;
	}
	public void setPlanetasControlados(List<Planeta> planetasControlados) {
		this.planetasControlados = planetasControlados;
	}

}
