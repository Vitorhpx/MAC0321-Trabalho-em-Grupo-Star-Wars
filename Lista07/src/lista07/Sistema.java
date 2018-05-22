package lista07;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private String nome;
	private List<Planeta> planetas = new ArrayList<Planeta>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Planeta> getPlanetas() {
		return planetas;
	}
	public void setPlanetas(List<Planeta> planetas) {
		this.planetas = planetas;
	}
}
